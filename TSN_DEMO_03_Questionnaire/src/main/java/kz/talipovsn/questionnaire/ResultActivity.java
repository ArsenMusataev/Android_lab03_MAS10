package kz.talipovsn.questionnaire;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Переменная доступа к компоненту окна с инициализацией
        EditText editText = findViewById(R.id.editText);

        // Запрет на редактирование в компоненте "editText"
        editText.setKeyListener(null);

        // Очистка данных в компоненте "editText"
        editText.setText("");


        // Добавление данных в компонент "editText"
        editText.append(String.format("%s %s \n", getString(R.string.Имя), getIntent().getStringExtra("name")));
        editText.append(String.format("%s %s \n", getString(R.string.Операционная_система), getIntent().getStringExtra("ops")));
        editText.append(String.format("%s %s \n", getString(R.string.Брендд), getIntent().getStringExtra("brand")));
    }

    // МЕТОД ДЛЯ КНОПКИ НАЗАД
    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }

    // МЕТОД ДЛЯ КНОПКИ ВЫХОДА
    public void onExit(View v) {
        finishAffinity();
    }

}
