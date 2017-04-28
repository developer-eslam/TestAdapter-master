package com.testadapter.rehab.testadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by RERE on 4/28/2017.
 */

public class MyAdapter extends BaseAdapter{
    String []items;
    String []names;
    Context context;

   public MyAdapter(Context context,String[] Items,String []names){
        this.items=Items;
       this.names=names;
        this.context=context;
    }

    @Override
    public int getCount() {

        if(items!=null && names!=null) {
            if(names!=null){
                return names.length;

            }
            return  items.length;
        }
        return  0;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
      //  View gridview;
      //  gridview=new View(context);

       // gridview= LayoutInflater.from(context).inflate(R.layout.row_data,null);

        //TextView textView=(TextView)gridview.findViewById(R.id.textviewnames);
      //  TextView textView1=(TextView)gridview.findViewById(R.id.textviewemail);

       // textView.setText(items[i]);
       // textView1.setText(items[i]);

        //return gridview;



        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);




            view = inflater.inflate(R.layout.row_data, null);


            TextView textView = (TextView) view.findViewById(R.id.textviewnames);
            textView.setText(names[i]);
            TextView textView1=(TextView)view.findViewById(R.id.textviewemail);
          textView1.setText(items[i]);


        return view;
    }
}
