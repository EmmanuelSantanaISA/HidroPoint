package com.hidroguys.customsmackapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by emman on 7/4/2016.
 */
public class ConnectionAsyncTask extends AsyncTask<Void, Void, Boolean> {

    private ProgressDialog dialog;
    private Context context;

    @Override
    protected void onPreExecute() {
        this.dialog.setMessage("Connecting to server...");
        this.dialog.setTitle("Connect");
        this.dialog.show();
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Boolean s) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
