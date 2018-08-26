package apps.royallucky.com.firebasedemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Firebase mRootRef;
    TextView textView1,textView2;
    EditText editText1,editText2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.txt1);
        textView2 = (TextView)findViewById(R.id.txt2);
        editText1 = (EditText)findViewById(R.id.edt1);
        editText2 = (EditText)findViewById(R.id.edt2);
        button = (Button) findViewById(R.id.btn);

        mRootRef = new Firebase("https://fir-demo2-49727.firebaseio.com/");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = editText1.getText().toString();
                String s2 = editText2.getText().toString();

                Firebase childRef = mRootRef.child(s1);
                childRef.setValue(s2);
            }
        });




    }
}
