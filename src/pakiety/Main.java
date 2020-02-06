package pakiety;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main extends JFrame {

    public Main() throws IOException
    {
        super("kino");
        this.setSize(Ekran.szerokosc,Ekran.wysokosc);
        Plik.odczyPliku();
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void zapis ()
    {
        try {
            Plik.zapisPliku();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void initComponents() throws IOException {

        String zielony = "zielony";
        int liczba = 50;
        int pRzad =250;
        int szerMiejsca = (int)((Ekran.szerokosc - 100)/20);
        int wysMiejsca = (int)((Ekran.wysokosc - 100)/8);



        JButton centrum,miejsce,kolorCzerwony,kolorCzarny,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17;
        JButton m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30,m31,m32,m33,m34,m35,m36,m37;
        JButton m38,m39,m40,m41,m42,m43,m44,m45,m46,m47,m48,m49,m50,m51,m52,m53,m54,m55,m56,m57;
        JButton m58,m59,m60,m61,m62,m63,m64,m65,m66,m67,m68,m69,m70,m71,m72,m73,m74,m75,m76,m77;

        Container kontener = this.getContentPane();

        miejsce = new JButton("Ekran");
        centrum = new JButton("m1");
        kolorCzerwony = new JButton("m3");
        kolorCzarny = new JButton("m2");
        m1 = new JButton("m4");
        m2 = new JButton("m5");
        m3 = new JButton("m6");
        m4 = new JButton("m7");
        m5 = new JButton("m8");
        m6 = new JButton("m9");
        m7 = new JButton("m10");
        m8 = new JButton("m11");
        m9 = new JButton("m12");
        m10 = new JButton("m13");
        m11 = new JButton("m14");
        m12 = new JButton("m15");
        m13 = new JButton("m16");
        m14 = new JButton("m17");
        m15 = new JButton("m18");
        m16 = new JButton("m19");
        m17 = new JButton("m20");
        m18 = new JButton("m21");
        m19 = new JButton("m22");
        m20 = new JButton("m23");
        m21 = new JButton("m24");
        m22 = new JButton("m25");
        m23 = new JButton("m26");
        m24 = new JButton("m27");
        m25 = new JButton("m28");
        m26 = new JButton("m29");
        m27 = new JButton("m30");
        m28 = new JButton("m31");
        m29 = new JButton("m32");
        m30 = new JButton("m33");
        m31 = new JButton("m34");
        m32 = new JButton("m35");
        m33 = new JButton("m36");
        m34 = new JButton("m37");
        m35 = new JButton("m38");
        m36 = new JButton("m39");
        m37 = new JButton("m40");
        m38 = new JButton("m41");
        m39 = new JButton("m42");
        m40 = new JButton("m43");
        m41 = new JButton("m44");
        m42 = new JButton("m45");
        m43 = new JButton("m46");
        m44 = new JButton("m47");
        m45 = new JButton("m48");
        m46 = new JButton("m49");
        m47 = new JButton("m50");
        m48 = new JButton("m51");
        m49 = new JButton("m52");
        m50 = new JButton("m53");
        m51 = new JButton("m54");
        m52 = new JButton("m55");
        m53 = new JButton("m56");
        m54 = new JButton("m57");
        m55 = new JButton("m58");
        m56 = new JButton("m59");
        m57 = new JButton("m60");
        m58 = new JButton("m61");
        m59 = new JButton("m62");
        m60 = new JButton("m63");
        m61 = new JButton("m64");
        m62 = new JButton("m65");
        m63 = new JButton("m66");
        m64 = new JButton("m67");
        m65 = new JButton("m68");
        m66 = new JButton("m69");
        m67 = new JButton("m70");
        m68 = new JButton("m71");
        m69 = new JButton("m72");
        m70 = new JButton("m73");
        m71 = new JButton("m74");
        m72 = new JButton("m75");
        m73 = new JButton("m76");
        m74 = new JButton("m77");
        m75 = new JButton("m79");
        m76 = new JButton("m79");
        m77 = new JButton("m80");

        if(Plik.tablica.get(1).equals(zielony))
        {
            kolorCzarny.setBackground(Color.GREEN);
        }else
        {
            kolorCzarny.setBackground(Color.RED);
        }

        if(Plik.tablica.get(2).equals(zielony))
        {
            kolorCzerwony.setBackground(Color.GREEN);
        }else
        {
            kolorCzerwony.setBackground(Color.RED);
        }

        if(Plik.tablica.get(0).equals(zielony))
        {
            centrum.setBackground(Color.GREEN);
        }else
        {
            centrum.setBackground(Color.RED);
        }

        miejsce.setBackground(Color.BLUE);

        if(Plik.tablica.get(3).equals(zielony))
        {
            m1.setBackground(Color.GREEN);
        }else
        {
            m1.setBackground(Color.RED);
        }

        if(Plik.tablica.get(4).equals(zielony))
        {
            m2.setBackground(Color.GREEN);
        }else
        {
            m2.setBackground(Color.RED);
        }

        if(Plik.tablica.get(5).equals(zielony))
        {
            m3.setBackground(Color.GREEN);
        }else
        {
            m3.setBackground(Color.RED);
        }
        if(Plik.tablica.get(6).equals(zielony))
        {
            m4.setBackground(Color.GREEN);
        }else
        {
            m4.setBackground(Color.RED);
        }
        if(Plik.tablica.get(7).equals(zielony))
        {
            m5.setBackground(Color.GREEN);
        }else
        {
            m5.setBackground(Color.RED);
        }
        if(Plik.tablica.get(8).equals(zielony))
        {
            m6.setBackground(Color.GREEN);
        }else
        {
            m6.setBackground(Color.RED);
        }
        if(Plik.tablica.get(9).equals(zielony))
        {
            m7.setBackground(Color.GREEN);
        }else
        {
            m7.setBackground(Color.RED);
        }

        if(Plik.tablica.get(10).equals(zielony))
        {
            m8.setBackground(Color.GREEN);
        }else
        {
            m8.setBackground(Color.RED);
        }
        if(Plik.tablica.get(11).equals(zielony))
        {
            m9.setBackground(Color.GREEN);
        }else
        {
            m9.setBackground(Color.RED);
        }
        if(Plik.tablica.get(12).equals(zielony))
        {
            m10.setBackground(Color.GREEN);
        }else
        {
            m10.setBackground(Color.RED);
        }
        if(Plik.tablica.get(13).equals(zielony))
        {
            m11.setBackground(Color.GREEN);
        }else
        {
            m11.setBackground(Color.RED);
        }
        if(Plik.tablica.get(14).equals(zielony))
        {
            m12.setBackground(Color.GREEN);
        }else
        {
            m12.setBackground(Color.RED);
        }
        if(Plik.tablica.get(15).equals(zielony))
        {
            m13.setBackground(Color.GREEN);
        }else
        {
            m13.setBackground(Color.RED);
        }
        if(Plik.tablica.get(16).equals(zielony))
        {
            m14.setBackground(Color.GREEN);
        }else
        {
            m14.setBackground(Color.RED);
        }
        if(Plik.tablica.get(17).equals(zielony))
        {
            m15.setBackground(Color.GREEN);
        }else
        {
            m15.setBackground(Color.RED);
        }
        if(Plik.tablica.get(18).equals(zielony))
        {
            m16.setBackground(Color.GREEN);
        }else
        {
            m16.setBackground(Color.RED);
        }
        if(Plik.tablica.get(19).equals(zielony))
        {
            m17.setBackground(Color.GREEN);
        }else
        {
            m17.setBackground(Color.RED);
        }
        if(Plik.tablica.get(20).equals(zielony))
        {
            m18.setBackground(Color.GREEN);
        }else
        {
            m18.setBackground(Color.RED);
        }
        if(Plik.tablica.get(21).equals(zielony))
        {
            m19.setBackground(Color.GREEN);
        }else
        {
            m19.setBackground(Color.RED);
        }
        if(Plik.tablica.get(22).equals(zielony))
        {
            m20.setBackground(Color.GREEN);
        }else
        {
            m20.setBackground(Color.RED);
        }
        if(Plik.tablica.get(23).equals(zielony))
        {
            m21.setBackground(Color.GREEN);
        }else
        {
            m21.setBackground(Color.RED);
        }
        if(Plik.tablica.get(24).equals(zielony))
        {
            m22.setBackground(Color.GREEN);
        }else
        {
            m22.setBackground(Color.RED);
        }
        if(Plik.tablica.get(25).equals(zielony))
        {
            m23.setBackground(Color.GREEN);
        }else
        {
            m23.setBackground(Color.RED);
        }
        if(Plik.tablica.get(26).equals(zielony))
        {
            m24.setBackground(Color.GREEN);
        }else
        {
            m24.setBackground(Color.RED);
        }
        if(Plik.tablica.get(27).equals(zielony))
        {
            m25.setBackground(Color.GREEN);
        }else
        {
            m25.setBackground(Color.RED);
        }
        if(Plik.tablica.get(28).equals(zielony))
        {
            m26.setBackground(Color.GREEN);
        }else
        {
            m26.setBackground(Color.RED);
        }
        if(Plik.tablica.get(29).equals(zielony))
        {
            m27.setBackground(Color.GREEN);
        }else
        {
            m27.setBackground(Color.RED);
        }
        if(Plik.tablica.get(30).equals(zielony))
        {
            m28.setBackground(Color.GREEN);
        }else
        {
            m28.setBackground(Color.RED);
        }
        if(Plik.tablica.get(31).equals(zielony))
        {
            m29.setBackground(Color.GREEN);
        }else
        {
            m29.setBackground(Color.RED);
        }
        if(Plik.tablica.get(32).equals(zielony))
        {
            m30.setBackground(Color.GREEN);
        }else
        {
            m30.setBackground(Color.RED);
        }
        if(Plik.tablica.get(33).equals(zielony))
        {
            m31.setBackground(Color.GREEN);
        }else
        {
            m31.setBackground(Color.RED);
        }
        if(Plik.tablica.get(34).equals(zielony))
        {
            m32.setBackground(Color.GREEN);
        }else
        {
            m32.setBackground(Color.RED);
        }
        if(Plik.tablica.get(35).equals(zielony))
        {
            m33.setBackground(Color.GREEN);
        }else
        {
            m33.setBackground(Color.RED);
        }
        if(Plik.tablica.get(36).equals(zielony))
        {
            m34.setBackground(Color.GREEN);
        }else
        {
            m34.setBackground(Color.RED);
        }
        if(Plik.tablica.get(37).equals(zielony))
        {
            m35.setBackground(Color.GREEN);
        }else
        {
            m35.setBackground(Color.RED);
        }
        if(Plik.tablica.get(38).equals(zielony))
        {
            m36.setBackground(Color.GREEN);
        }else
        {
            m36.setBackground(Color.RED);
        }
        if(Plik.tablica.get(39).equals(zielony))
        {
            m37.setBackground(Color.GREEN);
        }else
        {
            m37.setBackground(Color.RED);
        }
        if(Plik.tablica.get(40).equals(zielony))
        {
            m38.setBackground(Color.GREEN);
        }else
        {
            m38.setBackground(Color.RED);
        }
        if(Plik.tablica.get(41).equals(zielony))
        {
            m39.setBackground(Color.GREEN);
        }else
        {
            m39.setBackground(Color.RED);
        }
        if(Plik.tablica.get(42).equals(zielony))
        {
            m40.setBackground(Color.GREEN);
        }else
        {
            m40.setBackground(Color.RED);
        }
        if(Plik.tablica.get(43).equals(zielony))
        {
            m41.setBackground(Color.GREEN);
        }else
        {
            m41.setBackground(Color.RED);
        }
        if(Plik.tablica.get(44).equals(zielony))
        {
            m42.setBackground(Color.GREEN);
        }else
        {
            m42.setBackground(Color.RED);
        }
        if(Plik.tablica.get(45).equals(zielony))
        {
            m43.setBackground(Color.GREEN);
        }else
        {
            m43.setBackground(Color.RED);
        }
        if(Plik.tablica.get(46).equals(zielony))
        {
            m44.setBackground(Color.GREEN);
        }else
        {
            m44.setBackground(Color.RED);
        }
        if(Plik.tablica.get(47).equals(zielony))
        {
            m45.setBackground(Color.GREEN);
        }else
        {
            m45.setBackground(Color.RED);
        }
        if(Plik.tablica.get(48).equals(zielony))
        {
            m46.setBackground(Color.GREEN);
        }else
        {
            m46.setBackground(Color.RED);
        }
        if(Plik.tablica.get(49).equals(zielony))
        {
            m47.setBackground(Color.GREEN);
        }else
        {
            m47.setBackground(Color.RED);
        }
        if(Plik.tablica.get(50).equals(zielony))
        {
            m48.setBackground(Color.GREEN);
        }else
        {
            m48.setBackground(Color.RED);
        }
        if(Plik.tablica.get(51).equals(zielony))
        {
            m49.setBackground(Color.GREEN);
        }else
        {
            m49.setBackground(Color.RED);
        }
        if(Plik.tablica.get(52).equals(zielony))
        {
            m50.setBackground(Color.GREEN);
        }else
        {
            m50.setBackground(Color.RED);
        }
        if(Plik.tablica.get(53).equals(zielony))
        {
            m51.setBackground(Color.GREEN);
        }else
        {
            m51.setBackground(Color.RED);
        }
        if(Plik.tablica.get(54).equals(zielony))
        {
            m52.setBackground(Color.GREEN);
        }else
        {
            m52.setBackground(Color.RED);
        }
        if(Plik.tablica.get(55).equals(zielony))
        {
            m53.setBackground(Color.GREEN);
        }else
        {
            m53.setBackground(Color.RED);
        }
        if(Plik.tablica.get(56).equals(zielony))
        {
            m54.setBackground(Color.GREEN);
        }else
        {
            m54.setBackground(Color.RED);
        }
        if(Plik.tablica.get(57).equals(zielony))
        {
            m55.setBackground(Color.GREEN);
        }else
        {
            m55.setBackground(Color.RED);
        }
        if(Plik.tablica.get(58).equals(zielony))
        {
            m56.setBackground(Color.GREEN);
        }else
        {
            m56.setBackground(Color.RED);
        }
        if(Plik.tablica.get(59).equals(zielony))
        {
            m57.setBackground(Color.GREEN);
        }else
        {
            m57.setBackground(Color.RED);
        }
        if(Plik.tablica.get(60).equals(zielony))
        {
            m58.setBackground(Color.GREEN);
        }else
        {
            m58.setBackground(Color.RED);
        }
        if(Plik.tablica.get(61).equals(zielony))
        {
            m59.setBackground(Color.GREEN);
        }else
        {
            m59.setBackground(Color.RED);
        }
        if(Plik.tablica.get(62).equals(zielony))
        {
            m60.setBackground(Color.GREEN);
        }else
        {
            m60.setBackground(Color.RED);
        }
        if(Plik.tablica.get(63).equals(zielony))
        {
            m61.setBackground(Color.GREEN);
        }else
        {
            m61.setBackground(Color.RED);
        }
        if(Plik.tablica.get(64).equals(zielony))
        {
            m62.setBackground(Color.GREEN);
        }else
        {
            m62.setBackground(Color.RED);
        }
        if(Plik.tablica.get(65).equals(zielony))
        {
            m63.setBackground(Color.GREEN);
        }else
        {
            m63.setBackground(Color.RED);
        }
        if(Plik.tablica.get(66).equals(zielony))
        {
            m64.setBackground(Color.GREEN);
        }else
        {
            m64.setBackground(Color.RED);
        }
        if(Plik.tablica.get(67).equals(zielony))
        {
            m65.setBackground(Color.GREEN);
        }else
        {
            m65.setBackground(Color.RED);
        }
        if(Plik.tablica.get(68).equals(zielony))
        {
            m66.setBackground(Color.GREEN);
        }else
        {
            m66.setBackground(Color.RED);
        }
        if(Plik.tablica.get(69).equals(zielony))
        {
            m67.setBackground(Color.GREEN);
        }else
        {
            m67.setBackground(Color.RED);
        }
        if(Plik.tablica.get(70).equals(zielony))
        {
            m68.setBackground(Color.GREEN);
        }else
        {
            m68.setBackground(Color.RED);
        }
        if(Plik.tablica.get(71).equals(zielony))
        {
            m69.setBackground(Color.GREEN);
        }else
        {
            m69.setBackground(Color.RED);
        }
        if(Plik.tablica.get(72).equals(zielony))
        {
            m70.setBackground(Color.GREEN);
        }else
        {
            m70.setBackground(Color.RED);
        }
        if(Plik.tablica.get(73).equals(zielony))
        {
            m71.setBackground(Color.GREEN);
        }else
        {
            m71.setBackground(Color.RED);
        }
        if(Plik.tablica.get(74).equals(zielony))
        {
            m72.setBackground(Color.GREEN);
        }else
        {
            m72.setBackground(Color.RED);
        }
        if(Plik.tablica.get(75).equals(zielony))
        {
            m73.setBackground(Color.GREEN);
        }else
        {
            m73.setBackground(Color.RED);
        }
        if(Plik.tablica.get(76).equals(zielony))
        {
            m74.setBackground(Color.GREEN);
        }else
        {
            m74.setBackground(Color.RED);
        }
        if(Plik.tablica.get(77).equals(zielony))
        {
            m75.setBackground(Color.GREEN);
        }else
        {
            m75.setBackground(Color.RED);
        }
        if(Plik.tablica.get(78).equals(zielony))
        {
            m76.setBackground(Color.GREEN);
        }else
        {
            m76.setBackground(Color.RED);
        }
        if(Plik.tablica.get(79).equals(zielony))
        {
            m77.setBackground(Color.GREEN);
        }else
        {
            m77.setBackground(Color.RED);
        }

        centrum.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                centrum.setBackground(Color.RED);
                Plik.tablica.set(0, "czerwony");
                zapis();
            }
        });
        kolorCzerwony.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                kolorCzerwony.setBackground(Color.RED);
                Plik.tablica.set(2, "czerwony");
                zapis();
            }
        });
        kolorCzarny.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                kolorCzarny.setBackground(Color.RED);
                Plik.tablica.set(1, "czerwony");
                zapis();
            }
        });

        m1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m1.setBackground(Color.RED);
                Plik.tablica.set(3, "czerwony");
                zapis();
            }
        });
        m2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m2.setBackground(Color.RED);
                Plik.tablica.set(4, "czerwony");
                zapis();
            }
        });
        m3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m3.setBackground(Color.RED);
                Plik.tablica.set(5, "czerwony");
                zapis();
            }
        });
        m4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m4.setBackground(Color.RED);
                Plik.tablica.set(6, "czerwony");
                zapis();
            }
        });
        m5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m5.setBackground(Color.RED);
                Plik.tablica.set(7, "czerwony");
                zapis();
            }
        });
        m6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m6.setBackground(Color.RED);
                Plik.tablica.set(8, "czerwony");
                zapis();
            }
        });
        m7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m7.setBackground(Color.RED);
                Plik.tablica.set(9, "czerwony");
                zapis();
            }
        });
        m8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m8.setBackground(Color.RED);
                Plik.tablica.set(10, "czerwony");
                zapis();
            }
        });
        m9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m9.setBackground(Color.RED);
                Plik.tablica.set(11, "czerwony");
                zapis();
            }
        });
        m10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m10.setBackground(Color.RED);
                Plik.tablica.set(12, "czerwony");
                zapis();
            }
        });
        m11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m11.setBackground(Color.RED);
                Plik.tablica.set(13, "czerwony");
                zapis();
            }
        });
        m12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m12.setBackground(Color.RED);
                Plik.tablica.set(14, "czerwony");
                zapis();
            }
        });
        m13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m13.setBackground(Color.RED);
                Plik.tablica.set(15, "czerwony");
                zapis();
            }
        });
        m14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m14.setBackground(Color.RED);
                Plik.tablica.set(16, "czerwony");
                zapis();
            }
        });
        m15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m15.setBackground(Color.RED);
                Plik.tablica.set(17, "czerwony");
                zapis();
            }
        });
        m16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m16.setBackground(Color.RED);
                Plik.tablica.set(18, "czerwony");
                zapis();
            }
        });

        m17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m17.setBackground(Color.RED);
                Plik.tablica.set(19, "czerwony");
                zapis();
            }
        });

        m18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m18.setBackground(Color.RED);
                Plik.tablica.set(20, "czerwony");
                zapis();
            }
        });
        m19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m19.setBackground(Color.RED);
                Plik.tablica.set(21, "czerwony");
                zapis();
            }
        });
        m20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m20.setBackground(Color.RED);
                Plik.tablica.set(22, "czerwony");
                zapis();
            }
        });
        m21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m21.setBackground(Color.RED);
                Plik.tablica.set(23, "czerwony");
                zapis();
            }
        });
        m22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m22.setBackground(Color.RED);
                Plik.tablica.set(24, "czerwony");
                zapis();
            }
        });
        m23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m23.setBackground(Color.RED);
                Plik.tablica.set(25, "czerwony");
                zapis();
            }
        });
        m24.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m24.setBackground(Color.RED);
                Plik.tablica.set(26, "czerwony");
                zapis();
            }
        });
        m25.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m25.setBackground(Color.RED);
                Plik.tablica.set(27, "czerwony");
                zapis();
            }
        });
        m26.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m26.setBackground(Color.RED);
                Plik.tablica.set(28, "czerwony");
                zapis();
            }
        });
        m27.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m27.setBackground(Color.RED);
                Plik.tablica.set(29, "czerwony");
                zapis();
            }
        });
        m28.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m28.setBackground(Color.RED);
                Plik.tablica.set(30, "czerwony");
                zapis();
            }
        });

        m29.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m29.setBackground(Color.RED);
                Plik.tablica.set(31, "czerwony");
                zapis();
            }
        });
        m30.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m30.setBackground(Color.RED);
                Plik.tablica.set(32, "czerwony");
                zapis();
            }
        });
        m31.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m31.setBackground(Color.RED);
                Plik.tablica.set(33, "czerwony");
                zapis();
            }
        });
        m32.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m32.setBackground(Color.RED);
                Plik.tablica.set(34, "czerwony");
                zapis();
            }
        });

        m33.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m33.setBackground(Color.RED);
                Plik.tablica.set(35, "czerwony");
                zapis();
            }
        });

        m34.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m34.setBackground(Color.RED);
                Plik.tablica.set(36, "czerwony");
                zapis();
            }
        });

        m35.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m35.setBackground(Color.RED);
                Plik.tablica.set(37, "czerwony");
                zapis();
            }
        });

        m36.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m36.setBackground(Color.RED);
                Plik.tablica.set(38, "czerwony");
                zapis();
            }
        });

        m37.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m37.setBackground(Color.RED);
                Plik.tablica.set(39, "czerwony");
                zapis();
            }
        });
        m38.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m38.setBackground(Color.RED);
                Plik.tablica.set(40, "czerwony");
                zapis();
            }
        });
        m39.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m39.setBackground(Color.RED);
                Plik.tablica.set(41, "czerwony");
                zapis();
            }
        });
        m40.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m40.setBackground(Color.RED);
                Plik.tablica.set(42, "czerwony");
                zapis();
            }
        });
        m41.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m41.setBackground(Color.RED);
                Plik.tablica.set(43, "czerwony");
                zapis();
            }
        });
        m42.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m42.setBackground(Color.RED);
                Plik.tablica.set(44, "czerwony");
                zapis();
            }
        });
        m43.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m43.setBackground(Color.RED);
                Plik.tablica.set(45, "czerwony");
                zapis();
            }
        });
        m44.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m44.setBackground(Color.RED);
                Plik.tablica.set(46, "czerwony");
                zapis();
            }
        });
        m45.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m45.setBackground(Color.RED);
                Plik.tablica.set(47, "czerwony");
                zapis();
            }
        });
        m46.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m46.setBackground(Color.RED);
                Plik.tablica.set(48, "czerwony");
                zapis();
            }
        });
        m47.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m47.setBackground(Color.RED);
                Plik.tablica.set(49, "czerwony");
                zapis();
            }
        });
        m48.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m48.setBackground(Color.RED);
                Plik.tablica.set(50, "czerwony");
                zapis();
            }
        });
        m49.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m49.setBackground(Color.RED);
                Plik.tablica.set(51, "czerwony");
                zapis();
            }
        });
        m50.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m50.setBackground(Color.RED);
                Plik.tablica.set(52, "czerwony");
                zapis();
            }
        });
        m51.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m51.setBackground(Color.RED);
                Plik.tablica.set(53, "czerwony");
                zapis();
            }
        });
        m52.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m52.setBackground(Color.RED);
                Plik.tablica.set(54, "czerwony");
                zapis();
            }
        });

        m53.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m53.setBackground(Color.RED);
                Plik.tablica.set(55, "czerwony");
                zapis();
            }
        });

        m54.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m54.setBackground(Color.RED);
                Plik.tablica.set(56, "czerwony");
                zapis();
            }
        });

        m55.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m55.setBackground(Color.RED);
                Plik.tablica.set(57, "czerwony");
                zapis();
            }
        });

        m56.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m56.setBackground(Color.RED);
                Plik.tablica.set(58, "czerwony");
                zapis();
            }
        });

        m57.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m57.setBackground(Color.RED);
                Plik.tablica.set(59, "czerwony");
                zapis();
            }
        });

        m58.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m58.setBackground(Color.RED);
                Plik.tablica.set(60, "czerwony");
                zapis();
            }
        });
        m59.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m59.setBackground(Color.RED);
                Plik.tablica.set(61, "czerwony");
                zapis();

            }
        });
        m60.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m60.setBackground(Color.RED);
                Plik.tablica.set(62, "czerwony");
                zapis();
            }
        });
        m61.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m61.setBackground(Color.RED);
                Plik.tablica.set(63, "czerwony");
                zapis();
            }
        });
        m62.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m62.setBackground(Color.RED);
                Plik.tablica.set(64, "czerwony");
                zapis();
            }
        });
        m63.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m63.setBackground(Color.RED);
                Plik.tablica.set(65, "czerwony");
                zapis();
            }
        });
        m64.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m64.setBackground(Color.RED);
                Plik.tablica.set(66, "czerwony");
                zapis();
            }
        });
        m65.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m65.setBackground(Color.RED);
                Plik.tablica.set(67, "czerwony");
                zapis();
            }
        });
        m66.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m66.setBackground(Color.RED);
                Plik.tablica.set(68, "czerwony");
                zapis();
            }
        });
        m67.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m67.setBackground(Color.RED);
                Plik.tablica.set(69, "czerwony");
                zapis();
            }
        });
        m68.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m68.setBackground(Color.RED);
                Plik.tablica.set(70, "czerwony");
                zapis();
            }
        });
        m69.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m69.setBackground(Color.RED);
                Plik.tablica.set(71, "czerwony");
                zapis();
            }
        });
        m70.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m70.setBackground(Color.RED);
                Plik.tablica.set(72, "czerwony");
                zapis();
            }
        });
        m71.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m71.setBackground(Color.RED);
                Plik.tablica.set(73, "czerwony");
                zapis();
            }
        });
        m72.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m72.setBackground(Color.RED);
                Plik.tablica.set(74, "czerwony");
                zapis();
            }
        });

        m73.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m73.setBackground(Color.RED);
                Plik.tablica.set(75, "czerwony");
                zapis();
            }
        });

        m74.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m74.setBackground(Color.RED);
                Plik.tablica.set(76, "czerwony");
                zapis();
            }
        });

        m75.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m75.setBackground(Color.RED);
                Plik.tablica.set(77, "czerwony");
                zapis();
            }
        });

        m76.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m76.setBackground(Color.RED);
                Plik.tablica.set(78, "czerwony");
                zapis();

            }
        });

        m77.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                m77.setBackground(Color.RED);
                Plik.tablica.set(79, "czerwony");
               zapis();
            }
        });


        centrum.setLocation(liczba,pRzad);
        centrum.setSize(szerMiejsca,wysMiejsca);

        miejsce.setLocation((Ekran.szerokosc-500)/2,0);
        miejsce.setSize(500,50);

        kolorCzarny.setLocation(liczba+szerMiejsca,pRzad);
        kolorCzarny.setSize(szerMiejsca,wysMiejsca);

        kolorCzerwony.setLocation(liczba+2*szerMiejsca,pRzad);
        kolorCzerwony.setSize(szerMiejsca,wysMiejsca);

        m1.setLocation(liczba+3*szerMiejsca,pRzad);
        m1.setSize(szerMiejsca,wysMiejsca);

        m2.setLocation(liczba+4*szerMiejsca,pRzad);
        m2.setSize(szerMiejsca,wysMiejsca);

        m3.setLocation(liczba+5*szerMiejsca,pRzad);
        m3.setSize(szerMiejsca,wysMiejsca);

        m4.setLocation(liczba+6*szerMiejsca,pRzad);
        m4.setSize(szerMiejsca,wysMiejsca);

        m5.setLocation(liczba+7*szerMiejsca,pRzad);
        m5.setSize(szerMiejsca,wysMiejsca);

        m6.setLocation(liczba+8*szerMiejsca,pRzad);
        m6.setSize(szerMiejsca,wysMiejsca);

        m7.setLocation(liczba+9*szerMiejsca,pRzad);
        m7.setSize(szerMiejsca,wysMiejsca);

        m8.setLocation(liczba+10*szerMiejsca,pRzad);
        m8.setSize(szerMiejsca,wysMiejsca);

        m9.setLocation(liczba+11*szerMiejsca,pRzad);
        m9.setSize(szerMiejsca,wysMiejsca);

        m10.setLocation(liczba+12*szerMiejsca,pRzad);
        m10.setSize(szerMiejsca,wysMiejsca);

        m11.setLocation(liczba+13*szerMiejsca,pRzad);
        m11.setSize(szerMiejsca,wysMiejsca);

        m12.setLocation(liczba+14*szerMiejsca,pRzad);
        m12.setSize(szerMiejsca,wysMiejsca);

        m13.setLocation(liczba+15*szerMiejsca,pRzad);
        m13.setSize(szerMiejsca,wysMiejsca);

        m14.setLocation(liczba+16*szerMiejsca,pRzad);
        m14.setSize(szerMiejsca,wysMiejsca);

        m15.setLocation(liczba+17*szerMiejsca,pRzad);
        m15.setSize(szerMiejsca,wysMiejsca);

        m16.setLocation(liczba+18*szerMiejsca,pRzad);
        m16.setSize(szerMiejsca,wysMiejsca);

        m17.setLocation(liczba+19*szerMiejsca,pRzad);
        m17.setSize(szerMiejsca,wysMiejsca);

        m18.setLocation(liczba,pRzad+wysMiejsca);
        m18.setSize(szerMiejsca,wysMiejsca);

        m19.setLocation(liczba+szerMiejsca,pRzad+wysMiejsca);
        m19.setSize(szerMiejsca,wysMiejsca);

        m20.setLocation(liczba+2*szerMiejsca,pRzad+wysMiejsca);
        m20.setSize(szerMiejsca,wysMiejsca);

        m21.setLocation(liczba+3*szerMiejsca,pRzad+wysMiejsca);
        m21.setSize(szerMiejsca,wysMiejsca);

        m22.setLocation(liczba+4*szerMiejsca,pRzad+wysMiejsca);
        m22.setSize(szerMiejsca,wysMiejsca);

        m23.setLocation(liczba+5*szerMiejsca,pRzad+wysMiejsca);
        m23.setSize(szerMiejsca,wysMiejsca);

        m24.setLocation(liczba+6*szerMiejsca,pRzad+wysMiejsca);
        m24.setSize(szerMiejsca,wysMiejsca);

        m25.setLocation(liczba+7*szerMiejsca,pRzad+wysMiejsca);
        m25.setSize(szerMiejsca,wysMiejsca);

        m26.setLocation(liczba+8*szerMiejsca,pRzad+wysMiejsca);
        m26.setSize(szerMiejsca,wysMiejsca);

        m27.setLocation(liczba+9*szerMiejsca,pRzad+wysMiejsca);
        m27.setSize(szerMiejsca,wysMiejsca);

        m28.setLocation(liczba+10*szerMiejsca,pRzad+wysMiejsca);
        m28.setSize(szerMiejsca,wysMiejsca);

        m29.setLocation(liczba+11*szerMiejsca,pRzad+wysMiejsca);
        m29.setSize(szerMiejsca,wysMiejsca);

        m30.setLocation(liczba+12*szerMiejsca,pRzad+wysMiejsca);
        m30.setSize(szerMiejsca,wysMiejsca);

        m31.setLocation(liczba+13*szerMiejsca,pRzad+wysMiejsca);
        m31.setSize(szerMiejsca,wysMiejsca);

        m32.setLocation(liczba+14*szerMiejsca,pRzad+wysMiejsca);
        m32.setSize(szerMiejsca,wysMiejsca);

        m33.setLocation(liczba+15*szerMiejsca,pRzad+wysMiejsca);
        m33.setSize(szerMiejsca,wysMiejsca);

        m34.setLocation(liczba+16*szerMiejsca,pRzad+wysMiejsca);
        m34.setSize(szerMiejsca,wysMiejsca);

        m35.setLocation(liczba+17*szerMiejsca,pRzad+wysMiejsca);
        m35.setSize(szerMiejsca,wysMiejsca);

        m36.setLocation(liczba+18*szerMiejsca,pRzad+wysMiejsca);
        m36.setSize(szerMiejsca,wysMiejsca);

        m37.setLocation(liczba+19*szerMiejsca,pRzad+wysMiejsca);
        m37.setSize(szerMiejsca,wysMiejsca);

        m38.setLocation(liczba,pRzad+2*wysMiejsca);
        m38.setSize(szerMiejsca,wysMiejsca);

        m39.setLocation(liczba+szerMiejsca,pRzad+2*wysMiejsca);
        m39.setSize(szerMiejsca,wysMiejsca);

        m40.setLocation(liczba+2*szerMiejsca,pRzad+2*wysMiejsca);
        m40.setSize(szerMiejsca,wysMiejsca);

        m41.setLocation(liczba+3*szerMiejsca,pRzad+2*wysMiejsca);
        m41.setSize(szerMiejsca,wysMiejsca);

        m42.setLocation(liczba+4*szerMiejsca,pRzad+2*wysMiejsca);
        m42.setSize(szerMiejsca,wysMiejsca);

        m43.setLocation(liczba+5*szerMiejsca,pRzad+2*wysMiejsca);
        m43.setSize(szerMiejsca,wysMiejsca);

        m44.setLocation(liczba+6*szerMiejsca,pRzad+2*wysMiejsca);
        m44.setSize(szerMiejsca,wysMiejsca);

        m45.setLocation(liczba+7*szerMiejsca,pRzad+2*wysMiejsca);
        m45.setSize(szerMiejsca,wysMiejsca);

        m46.setLocation(liczba+8*szerMiejsca,pRzad+2*wysMiejsca);
        m46.setSize(szerMiejsca,wysMiejsca);

        m47.setLocation(liczba+9*szerMiejsca,pRzad+2*wysMiejsca);
        m47.setSize(szerMiejsca,wysMiejsca);

        m48.setLocation(liczba+10*szerMiejsca,pRzad+2*wysMiejsca);
        m48.setSize(szerMiejsca,wysMiejsca);

        m49.setLocation(liczba+11*szerMiejsca,pRzad+2*wysMiejsca);
        m49.setSize(szerMiejsca,wysMiejsca);

        m50.setLocation(liczba+12*szerMiejsca,pRzad+2*wysMiejsca);
        m50.setSize(szerMiejsca,wysMiejsca);

        m51.setLocation(liczba+13*szerMiejsca,pRzad+2*wysMiejsca);
        m51.setSize(szerMiejsca,wysMiejsca);

        m52.setLocation(liczba+14*szerMiejsca,pRzad+2*wysMiejsca);
        m52.setSize(szerMiejsca,wysMiejsca);

        m53.setLocation(liczba+15*szerMiejsca,pRzad+2*wysMiejsca);
        m53.setSize(szerMiejsca,wysMiejsca);

        m54.setLocation(liczba+16*szerMiejsca,pRzad+2*wysMiejsca);
        m54.setSize(szerMiejsca,wysMiejsca);

        m55.setLocation(liczba+17*szerMiejsca,pRzad+2*wysMiejsca);
        m55.setSize(szerMiejsca,wysMiejsca);

        m56.setLocation(liczba+18*szerMiejsca,pRzad+2*wysMiejsca);
        m56.setSize(szerMiejsca,wysMiejsca);

        m57.setLocation(liczba+19*szerMiejsca,pRzad+2*wysMiejsca);
        m57.setSize(szerMiejsca,wysMiejsca);

        m58.setLocation(liczba,pRzad+3*wysMiejsca);
        m58.setSize(szerMiejsca,wysMiejsca);

        m59.setLocation(liczba+szerMiejsca,pRzad+3*wysMiejsca);
        m59.setSize(szerMiejsca,wysMiejsca);

        m60.setLocation(liczba+2*szerMiejsca,pRzad+3*wysMiejsca);
        m60.setSize(szerMiejsca,wysMiejsca);

        m61.setLocation(liczba+3*szerMiejsca,pRzad+3*wysMiejsca);
        m61.setSize(szerMiejsca,wysMiejsca);

        m62.setLocation(liczba+4*szerMiejsca,pRzad+3*wysMiejsca);
        m62.setSize(szerMiejsca,wysMiejsca);

        m63.setLocation(liczba+5*szerMiejsca,pRzad+3*wysMiejsca);
        m63.setSize(szerMiejsca,wysMiejsca);

        m64.setLocation(liczba+6*szerMiejsca,pRzad+3*wysMiejsca);
        m64.setSize(szerMiejsca,wysMiejsca);

        m65.setLocation(liczba+7*szerMiejsca,pRzad+3*wysMiejsca);
        m65.setSize(szerMiejsca,wysMiejsca);

        m66.setLocation(liczba+8*szerMiejsca,pRzad+3*wysMiejsca);
        m66.setSize(szerMiejsca,wysMiejsca);

        m67.setLocation(liczba+9*szerMiejsca,pRzad+3*wysMiejsca);
        m67.setSize(szerMiejsca,wysMiejsca);

        m68.setLocation(liczba+10*szerMiejsca,pRzad+3*wysMiejsca);
        m68.setSize(szerMiejsca,wysMiejsca);

        m69.setLocation(liczba+11*szerMiejsca,pRzad+3*wysMiejsca);
        m69.setSize(szerMiejsca,wysMiejsca);

        m70.setLocation(liczba+12*szerMiejsca,pRzad+3*wysMiejsca);
        m70.setSize(szerMiejsca,wysMiejsca);

        m71.setLocation(liczba+13*szerMiejsca,pRzad+3*wysMiejsca);
        m71.setSize(szerMiejsca,wysMiejsca);

        m72.setLocation(liczba+14*szerMiejsca,pRzad+3*wysMiejsca);
        m72.setSize(szerMiejsca,wysMiejsca);

        m73.setLocation(liczba+15*szerMiejsca,pRzad+3*wysMiejsca);
        m73.setSize(szerMiejsca,wysMiejsca);

        m74.setLocation(liczba+16*szerMiejsca,pRzad+3*wysMiejsca);
        m74.setSize(szerMiejsca,wysMiejsca);

        m75.setLocation(liczba+17*szerMiejsca,pRzad+3*wysMiejsca);
        m75.setSize(szerMiejsca,wysMiejsca);

        m76.setLocation(liczba+18*szerMiejsca,pRzad+3*wysMiejsca);
        m76.setSize(szerMiejsca,wysMiejsca);

        m77.setLocation(liczba+19*szerMiejsca,pRzad+3*wysMiejsca);
        m77.setSize(szerMiejsca,wysMiejsca);

        kontener.setLayout(null);

        kontener.add(centrum);
        kontener.add(miejsce);
        kontener.add(kolorCzerwony);
        kontener.add(kolorCzarny);
        kontener.add(m1);
        kontener.add(m2);
        kontener.add(m3);
        kontener.add(m4);
        kontener.add(m5);
        kontener.add(m6);
        kontener.add(m7);
        kontener.add(m8);
        kontener.add(m9);
        kontener.add(m10);
        kontener.add(m11);
        kontener.add(m12);
        kontener.add(m13);
        kontener.add(m14);
        kontener.add(m15);
        kontener.add(m16);
        kontener.add(m17);
        kontener.add(m18);
        kontener.add(m19);
        kontener.add(m20);
        kontener.add(m21);
        kontener.add(m22);
        kontener.add(m23);
        kontener.add(m24);
        kontener.add(m25);
        kontener.add(m26);
        kontener.add(m27);
        kontener.add(m28);
        kontener.add(m29);
        kontener.add(m30);
        kontener.add(m31);
        kontener.add(m32);
        kontener.add(m33);
        kontener.add(m34);
        kontener.add(m35);
        kontener.add(m36);
        kontener.add(m37);
        kontener.add(m38);
        kontener.add(m39);
        kontener.add(m40);
        kontener.add(m41);
        kontener.add(m42);
        kontener.add(m43);
        kontener.add(m44);
        kontener.add(m45);
        kontener.add(m46);
        kontener.add(m47);
        kontener.add(m48);
        kontener.add(m49);
        kontener.add(m50);
        kontener.add(m51);
        kontener.add(m52);
        kontener.add(m53);
        kontener.add(m54);
        kontener.add(m55);
        kontener.add(m56);
        kontener.add(m57);
        kontener.add(m58);
        kontener.add(m59);
        kontener.add(m60);
        kontener.add(m61);
        kontener.add(m62);
        kontener.add(m63);
        kontener.add(m64);
        kontener.add(m65);
        kontener.add(m66);
        kontener.add(m67);
        kontener.add(m68);
        kontener.add(m69);
        kontener.add(m70);
        kontener.add(m71);
        kontener.add(m72);
        kontener.add(m73);
        kontener.add(m74);
        kontener.add(m75);
        kontener.add(m76);
        kontener.add(m77);

    }

    public static void main(String[] args) throws IOException {
        new Main().setVisible(true);


    }
}

class Ekran
{
    static int szerokosc =Toolkit.getDefaultToolkit().getScreenSize().width;//pobieramy szerokosc ekranu
    static int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
}


class Plik {
    static String nazwaPliku;
    static ArrayList<String> tablica = new ArrayList<>();

    public static void zapisPliku() throws IOException {
        String filename = "sala1.txt";
        try (FileWriter fileWriter = new FileWriter(filename)) {
            for (int i = 0; i < 80; i++) {
                fileWriter.write(tablica.get(i));
                fileWriter.write("\n");
            }
        }
    }

    public static void odczyPliku() throws IOException {

        BufferedReader we = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj nazwę pliku :");
        nazwaPliku = we.readLine() + ".txt";

        try (Scanner s = new Scanner(new FileReader(nazwaPliku))) {
            while (s.hasNext()) {
                tablica.add(s.nextLine());
            }

        }
    }
}
