package claur.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.flight:
                Toast.makeText(this, "Flight Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.hotel:
                Toast.makeText(this, "Hotel Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.spain:
                Toast.makeText(this, "Spain Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.italy:
                Toast.makeText(this, "Italy Selected", Toast.LENGTH_SHORT).show();
                return true;
            default: return super.onOptionsItemSelected(item);
        }

    }
}