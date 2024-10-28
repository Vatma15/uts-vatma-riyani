package uts.vatma.tasks;

                 import android.content.Intent;
                import android.os.Bundle;
                import android.view.View;
                import android.widget.Button;
                import android.widget.EditText;
                import android.widget.Toast;
                import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inisialisasi komponen
        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);

        // Event listener untuk tombol login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(LoginActivity.this,
                            "Username dan Password tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                // Contoh login sederhana dengan hardcoded credentials
                if (user.equals("admin") && pass.equals("admin123")) {
                    Toast.makeText(LoginActivity.this,
                            "Login Berhasil",
                            Toast.LENGTH_SHORT).show();

                    // Navigasi ke MainActivity
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Tutup LoginActivity agar tidak bisa kembali
                } else {
                    Toast.makeText(LoginActivity.this,
                            "Login Gagal, periksa username atau password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
