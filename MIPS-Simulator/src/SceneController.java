import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SceneController {
    int count = 0;
    Random rand = new Random();
    String randstr;
    int random;

    @FXML
    private ImageView mip;

    @FXML
    private TextField entry1;

    @FXML
    private TextField entry2;

    @FXML
    private Label result;

    @FXML
    private Button limpeza;

    @FXML
    private Button add;

    @FXML
    private Button read;

    @FXML
    private Button save;

    @FXML
    private Button sub;

    @FXML
    private Button multi;

    @FXML
    private Button div;

    @FXML
    private Button next;

    @FXML
    private Label num1;

    @FXML
    private Label num2;

    @FXML
    private Label operation;

    @FXML
    private Label memWrite;

    @FXML
    private Label memToReg;

    @FXML
    private Label memRead;

    @FXML
    private Label regWrite;

    @FXML
    private Label memPR;

    @FXML
    private Label memPW;

    @FXML
    void add(ActionEvent event) {
        if (!entry1.getText().equals("") && !entry2.getText().equals("")) {
            add.setVisible(false);
            div.setVisible(false);
            sub.setVisible(false);
            multi.setVisible(false);
            read.setVisible(false);
            save.setVisible(false);
            next.setVisible(true);

            num1.setText(entry1.getText());
            num2.setText(entry2.getText());

            int ientry1 = Integer.parseInt(entry1.getText());
            int ientry2 = Integer.parseInt(entry2.getText());
            int add = ientry1 + ientry2;

            result.setText("= " + add);

            operation.setText("Soma");

            Image ari1 = new Image("pics/Aritmetica1.png");
            mip.setImage(ari1);
            count = 1;
        }
    }

    @FXML
    void sub(ActionEvent event) {
        if (!entry1.getText().equals("") && !entry2.getText().equals("")) {
            add.setVisible(false);
            div.setVisible(false);
            sub.setVisible(false);
            multi.setVisible(false);
            read.setVisible(false);
            save.setVisible(false);
            next.setVisible(true);

            num1.setText(entry1.getText());
            num2.setText(entry2.getText());

            int ientry1 = Integer.parseInt(entry1.getText());
            int ientry2 = Integer.parseInt(entry2.getText());
            int sub = ientry1 - ientry2;

            result.setText("= " + sub);

            operation.setText("Subtração");

            Image ari1 = new Image("pics/Aritmetica1.png");
            mip.setImage(ari1);
            count = 1;
        }
    }

    @FXML
    void multi(ActionEvent event) {
        if (!entry1.getText().equals("") && !entry2.getText().equals("")) {
            add.setVisible(false);
            div.setVisible(false);
            sub.setVisible(false);
            multi.setVisible(false);
            read.setVisible(false);
            save.setVisible(false);
            next.setVisible(true);

            num1.setText(entry1.getText());
            num2.setText(entry2.getText());

            int ientry1 = Integer.parseInt(entry1.getText());
            int ientry2 = Integer.parseInt(entry2.getText());
            int multi = ientry1 * ientry2;

            result.setText("= " + multi);

            operation.setText("Multiplicação");

            Image ari1 = new Image("pics/Aritmetica1.png");
            mip.setImage(ari1);
            count = 1;
        }
    }

    @FXML
    void div(ActionEvent event) {
        if (!entry1.getText().equals("") && !entry2.getText().equals("")) {
            add.setVisible(false);
            div.setVisible(false);
            sub.setVisible(false);
            multi.setVisible(false);
            read.setVisible(false);
            save.setVisible(false);
            next.setVisible(true);

            num1.setText(entry1.getText());
            num2.setText(entry2.getText());

            int ientry1 = Integer.parseInt(entry1.getText());
            int ientry2 = Integer.parseInt(entry2.getText());
            int div = ientry1 / ientry2;

            result.setText("= " + div);
            operation.setText("Divisão");

            Image ari1 = new Image("pics/Aritmetica1.png");
            mip.setImage(ari1);
            count = 1;
        }
    }

    @FXML
    void read(ActionEvent event) {

        if (!entry1.getText().equals("")) {
            add.setVisible(false);
            div.setVisible(false);
            sub.setVisible(false);
            multi.setVisible(false);
            read.setVisible(false);
            save.setVisible(false);
            next.setVisible(true);

            num1.setText(entry1.getText());

            operation.setText("Ler");

            Image ler1 = new Image("pics/Ler1.png");
            mip.setImage(ler1);
            count = 4;
        }
    }

    @FXML
    void save(ActionEvent event) {

        if (!entry1.getText().equals("")) {
            add.setVisible(false);
            div.setVisible(false);
            sub.setVisible(false);
            multi.setVisible(false);
            read.setVisible(false);
            save.setVisible(false);
            next.setVisible(true);

            num1.setText(entry1.getText());

            operation.setText("Salvar");

            Image save1 = new Image("pics/Salvar1.png");
            mip.setImage(save1);
            count = 7;
        }
    }

    @FXML
    void limpar(ActionEvent event) {
        result.setText(null);

        num1.setText(null);
        num2.setText(null);
        entry1.setText(null);
        entry2.setText(null);

        add.setVisible(true);
        div.setVisible(true);
        sub.setVisible(true);
        multi.setVisible(true);
        read.setVisible(true);
        save.setVisible(true);
        next.setVisible(false);

        Image img = new Image("pics/Simulador MIP.png");
        mip.setImage(img);

        operation.setText(null);
        operation.setVisible(false);

        memRead.setText("Disable");
        memWrite.setText("Disable");
        memToReg.setText("Disable");
        regWrite.setText("Disable");

        memPR.setText("");
        memPW.setText("");

        count = 0;
    }

    @FXML
    void next(ActionEvent event) {

        switch (count) {
            case 1:
                Image ari2 = new Image("pics/Aritmetica2.png");
                mip.setImage(ari2);
                operation.setVisible(true);
                count++;
                break;

            case 2:
                Image ari3 = new Image("pics/Aritmetica3.png");
                mip.setImage(ari3);
                count++;
                break;

            case 3:
                Image ari4 = new Image("pics/Aritmetica4.png");
                mip.setImage(ari4);
                next.setVisible(false);
                break;

            case 4:
                Image ler2 = new Image("pics/Ler2.png");
                mip.setImage(ler2);
                operation.setVisible(true);
                count++;
                break;

            case 5:
                Image ler3 = new Image("pics/Ler3.png");
                mip.setImage(ler3);
                memRead.setText("Enable");
                count++;
                break;

            case 6:
                Image ler4 = new Image("pics/Ler4.png");
                mip.setImage(ler4);

                random = rand.nextInt(99);
                if (random < 10)
                    randstr = "0" + random + "H";
                else
                    randstr = random + "H";
                memPR.setText(randstr);

                result.setText("Posição na memória: " + randstr);

                next.setVisible(false);
                break;

            case 7:
                Image save2 = new Image("pics/Salvar2.png");
                mip.setImage(save2);
                operation.setVisible(true);
                count++;
                break;

            case 8:
                Image save3 = new Image("pics/Salvar3.png");
                mip.setImage(save3);
                memWrite.setText("Enable");

                random = rand.nextInt(99);
                if (random < 10)
                    randstr = "0" + random + "H";
                else
                    randstr = random + "H";
                memPW.setText(randstr);

                result.setText("Posição na memória: " + randstr);

                count++;
                break;

            case 9:
                Image save4 = new Image("pics/Salvar4.png");
                mip.setImage(save4);
                memToReg.setText("Enable");
                regWrite.setText("Enable");
                next.setVisible(false);
                break;

            default:
                break;
        }
    }

}