<<<<<<< HEAD


=======
import java.util.ArrayList;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class StatusAdapter extends ArrayAdapter<StatusBean> {

    private Context context;
    private ArrayList<StatusBean> statuses;
    public Resources res;
    StatusBean currRowVal = null;
    LayoutInflater inflater;

    public StatusAdapter(Context context,
                         int textViewResourceId, ArrayList<StatusBean> statuses,
                         Resources resLocal) {
        super(context, textViewResourceId, statuses);
        this.context = context;
        this.statuses = statuses;
        this.res = resLocal;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        View row = inflater.inflate(R.layout.status_item, parent, false);
        currRowVal = null;
        currRowVal = (StatusBean) statuses.get(position);
        TextView label = (TextView) row.findViewById(R.id.spinnerItem);
        if (position == 0) {
            label.setText("Please select status");
        } else {
            label.setText(currRowVal.getStatus());
        }

        return row;
    }
}
>>>>>>> origin/master
