package sg.edu.rp.c346.id22026408.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Declaring of field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tBtn;
    RadioGroup rgGender;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.displayButton);
        etInput = findViewById(R.id.editText);
        tBtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioButton);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButton){

                    String prefix = "";

                    if (checkedRadioId == R.id.radioButton) {
                        prefix = "He says: ";
                    } else if (checkedRadioId == R.id.radioButton2) {
                        prefix = "She says: ";
                    }

                    String displayText = prefix + stringResponse;

                    tvDisplay.setText(displayText);
                }
                else{

                }
                tvDisplay.setText(stringResponse);
            }
        });


        tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                boolean isChecked = tBtn.isChecked();
                EditText editText = findViewById(R.id.editText);
                editText.setEnabled(isChecked);
            }
        });

    }
}