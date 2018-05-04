package a1.assignment9.acadgild.com.assignment91;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Initialize the Textview variable
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Set the Reference the textview variable.
        textView = findViewById(R.id.textView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        create menu inflater
        MenuInflater menuInflater = getMenuInflater();
//        set menu inflater to the menu xml
        menuInflater.inflate(R.menu.menu, menu);
//        return true to the boolean value
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        Switch statement that gets the item id from the menu item
        switch (item.getItemId()) {
//            Case statements that decide on which menu button was clicked and what to do with it then breaks out
            case R.id.menu_Blue:
                textView.setTextColor(getResources().getColor(R.color.colorBlue));
                break;
//             Case statements that decide on which menu button was clicked and what to do with it then breaks out
            case R.id.menu_Green:
                textView.setTextColor(getResources().getColor(R.color.colorGreen));
                break;
//            Case statements that decide on which menu button was clicked and what to do with it then breaks out
            case R.id.menu_Red:
                textView.setTextColor(getResources().getColor(R.color.colorRed));
                break;
        }
//        Returns true to the boolean value
        return true;
    }
}
