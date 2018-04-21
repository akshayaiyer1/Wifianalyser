package com.example.admin.wifi1;


        import java.util.List;
        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import com.example.admin.wifi1.R;

public class ListAdapter extends ArrayAdapter<String> {
    Activity mActivity;
    List<String> wifiName;
    private LayoutInflater inflater;

    public ListAdapter(Activity a, List</String><String> wifiName) {
        super(a, R.layout.single_list, wifiName);
        mActivity = a;
        inflater = LayoutInflater.from(mActivity);
        this.wifiName = wifiName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.single_list, parent, false);
        TextView wifiProvider = (TextView) convertView.findViewById(R.id.list_view_wifi1);
        wifiProvider.setText(wifiName.get(position));
        return convertView;
    }

}
</String>