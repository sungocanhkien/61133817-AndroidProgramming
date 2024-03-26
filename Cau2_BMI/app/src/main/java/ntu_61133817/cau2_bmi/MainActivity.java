package ntu_61133817.cau2_bmi;

import android.os.Bundle;
import android.view.View;
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
        ketqua = findViewById(R.id.ketqua);
        nhanxet = findViewById(R.id.nhanxet);

        Tinhbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double HchieuCao = Double.parseDouble(chieuCao.getText().toString())/100;
                double HcanNang = Double.parseDouble(canNang.getText().toString());
                chiSo = Math.round((HcanNang/Math.pow(HchieuCao,2))*10.0)/10.0;
                if(nam.isChecked()){
                    if(chiSo<18.5){
                        ketqua.setText(String.valueOf(chiSo));
                        nhanxet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                }
            }
        });
    }
}