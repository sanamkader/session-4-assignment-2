package sanam.com.sample.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private TextView nametext;
    private TextView numbertext;
    private ArrayList<String> nametextview;
    private ArrayList<String> numbertextview;
    private Myadapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nametext = (TextView) findViewById(R.id.nametext);
        numbertext = (TextView) findViewById(R.id.numbertext);

        listview = (ListView) findViewById(R.id.listview);

        nametextview = new ArrayList<>();
        nametextview.add("Name 1");
        nametextview.add("Name 2");
        nametextview.add("Name 3");
        nametextview.add("Name 4");
        nametextview.add("Name 5");
        nametextview.add("Name 6");
        nametextview.add("Name 7");
        nametextview.add("Name 8");
        nametextview.add("Name 9");
        nametextview.add("Name 10");
        nametextview.add("Name 11");
        nametextview.add("Name 12");

        numbertextview = new ArrayList<>();
        numbertextview.add("PhoneNumber 1");
        numbertextview.add("PhoneNumber 2");
        numbertextview.add("PhoneNumber 3");
        numbertextview.add("PhoneNumber 4");
        numbertextview.add("PhoneNumber 5");
        numbertextview.add("PhoneNumber 6");
        numbertextview.add("PhoneNumber 7");
        numbertextview.add("PhoneNumber 8");
        numbertextview.add("PhoneNumber 9");
        numbertextview.add("PhoneNumber 10");
        numbertextview.add("PhoneNumber 11");
        numbertextview.add("PhoneNumber 12");


        myadapter = new Myadapter();
        listview.setAdapter(myadapter);


    }

    public class Myadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return nametextview.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View ConvertView, ViewGroup parent) {
            viewholder holder;
            if (ConvertView == null) {
                ConvertView = getLayoutInflater().inflate(R.layout.row_view, parent, false);
                holder = new viewholder();
                holder.bindView(ConvertView);
                ConvertView.setTag(holder);
                Log.e("Mainactivity", "convertview is null");
            } else {
                holder = (viewholder) ConvertView.getTag();

            }
            holder.nametext.setText(nametextview.get(position));
            holder.numbertext.setText(numbertextview.get(position));
            return ConvertView;
        }


    }

    public class viewholder {
        TextView nametext;
        TextView numbertext;

        void bindView(View convertView) {
            Log.e("MainActivity", "convertview is not null");
            nametext = (TextView) convertView.findViewById(R.id.nametext);
            numbertext = (TextView) convertView.findViewById(R.id.numbertext);


        }
    }
}
