package com.example.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void XyLyCong(View view){
        // Tìm, tham chiếu đến điều khiển trong tệp XML
        EditText editTextSoA = findViewById(R.id.editA);
        EditText editTextSoB = findViewById(R.id.editB);
        EditText editTextSoKQ = findViewById(R.id.editKQ);

        // Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        // Lấy dữ liệu về ở điều khiển số b
        String strB = editTextSoB.getText().toString();

        // Chuyển dữ liệu sang dạng số
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        // Tính tổng theo yêu cầu
        int tong = soA + soB;
        String strTong = String.valueOf(tong); // Chuyển tong sang dạng chuỗi

        // Hiện thị ra màn hình
        editTextSoKQ.setText(strTong);
    }
}