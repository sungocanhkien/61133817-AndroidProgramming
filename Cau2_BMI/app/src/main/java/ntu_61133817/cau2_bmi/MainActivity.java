package ntu_61133817.cau2_bmi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText chieuCao, canNang;
    RadioButton nam, nu;
    Button Tinhbmi;
    double chiSo;
    TextView ketqua, nhanxet;
    double ketQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chieuCao = findViewById(R.id.chieuCao);
        canNang = findViewById(R.id.canNang);
        nam = findViewById(R.id.nam);
        nu = findViewById(R.id.nu);
        Tinhbmi=findViewById(R.id.bmi);
        ketqua = findViewById(R.)
    }
}