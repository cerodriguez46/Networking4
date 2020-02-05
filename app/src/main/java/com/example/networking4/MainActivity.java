package com.example.networking4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String url = "freejsonapi/posts";

    public RecyclerView rvView;

    private RecyclerView.Adapter mAdapter;

    private RecyclerView.LayoutManager layoutManager;

    ArrayList<PostModel> postList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


rvView = (RecyclerView)findViewById(R.id.rv);
rvView.setHasFixedSize(true);

layoutManager = new LinearLayoutManager(this);
rvView.setLayoutManager(layoutManager);


        new fetchPosts(postList).execute(url);

    }
//first param is type that is passed from .execute(), which also gets passed as param to doInBackground
    //second param is for onProgressUpdate
    //third param is return type of doInBackground which gets returned and then passed as param in onPostExecute

    //first param needs to be string to pass the url
    //third param needs to be the arraylist so that can be returned after the background parsing is done and then set to recyclerview
    private class fetchPosts extends AsyncTask<String, Void, ArrayList<PostModel>> {

        ArrayList<PostModel> returnedArrayList;

        public fetchPosts(ArrayList<PostModel> returnedArrayList) {
            this.returnedArrayList = returnedArrayList;
        }

        @Override
        protected ArrayList<PostModel> doInBackground(String... strings) {
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

                InputStream stream = new BufferedInputStream(httpURLConnection.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder builder = new StringBuilder();

                String inputString;
                while ((inputString = bufferedReader.readLine()) != null) {
                    builder.append(inputString);
                }

                //JSON arrays always have to be passed to lists or recyclerviews
                JSONObject topLevel = new JSONObject(builder.toString());

                JSONArray data = topLevel.getJSONArray("data");

                for (int i = 0; i < data.length(); i++) {
                    JSONObject c = data.getJSONObject(i);
                    String id = c.getString("id");
                    String urlJson = c.getString("url");
                    String comments = c.getString("comments_url");
                    String title = c.getString("title");
                    String slug = c.getString("slug");
                    String image = c.getString("featured_image");
                    String body = c.getString("body");
                    String created = c.getString("created_at");
                    String updated = c.getString("updated_at");

                    PostModel postModel = new PostModel(id, urlJson, comments, title, slug, image, body, created, updated);
                    returnedArrayList.add(postModel);


                }

            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }


            return returnedArrayList;
        }

        @Override
        protected void onPostExecute(ArrayList<PostModel> postModels) {

            mAdapter = new PostAdapter(MainActivity.this, postModels);
            rvView.setAdapter(mAdapter);

            mAdapter.notifyDataSetChanged();
        }
    }
}








