import javax.swing.*;
import java.awt.*;

public class SpotifyInterface {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Spotify Proyecto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Ajustar el tamaño de la ventana
        frame.setLayout(null); // Usar layout absoluto

        // Crear panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null); // Layout absoluto para posicionar componentes
        panel.setBounds(0, 0, 800, 600);

        // Sección de "Artistas"
        JLabel artistasLabel = new JLabel("Artistas");
        artistasLabel.setBounds(50, 20, 100, 30);
        panel.add(artistasLabel);

        JButton crearArtistaBtn = new JButton("Crear art...");
        crearArtistaBtn.setBounds(50, 60, 100, 30);
        panel.add(crearArtistaBtn);

        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(50, 110, 100, 30);
        panel.add(nombreLabel);

        JTextField nombreField = new JTextField();
        nombreField.setBounds(50, 140, 100, 30);
        panel.add(nombreField);

        JLabel artistaLabel = new JLabel("Artista");
        artistaLabel.setBounds(50, 180, 100, 30);
        panel.add(artistaLabel);

        JTextField artistaField = new JTextField();
        artistaField.setBounds(50, 210, 100, 30);
        panel.add(artistaField);

        JLabel nacionalidadLabel = new JLabel("Nacionalidad");
        nacionalidadLabel.setBounds(50, 250, 100, 30);
        panel.add(nacionalidadLabel);

        JTextField nacionalidadField = new JTextField();
        nacionalidadField.setBounds(50, 280, 100, 30);
        panel.add(nacionalidadField);

        JButton guardarArtistaBtn = new JButton("Guardar");
        guardarArtistaBtn.setBounds(50, 330, 100, 30);
        panel.add(guardarArtistaBtn);

        // Sección de "Canciones"
        JLabel cancionesLabel = new JLabel("Canciones");
        cancionesLabel.setBounds(200, 20, 100, 30);
        panel.add(cancionesLabel);

        JButton crearCancionBtn = new JButton("Crear Canción");
        crearCancionBtn.setBounds(200, 60, 150, 30);
        panel.add(crearCancionBtn);

        JLabel tituloLabel = new JLabel("Título");
        tituloLabel.setBounds(200, 110, 100, 30);
        panel.add(tituloLabel);

        JTextField tituloField = new JTextField();
        tituloField.setBounds(200, 140, 150, 30);
        panel.add(tituloField);

        JLabel cancionArtistaLabel = new JLabel("Artista");
        cancionArtistaLabel.setBounds(200, 180, 100, 30);
        panel.add(cancionArtistaLabel);

        JTextField cancionArtistaField = new JTextField();
        cancionArtistaField.setBounds(200, 210, 150, 30);
        panel.add(cancionArtistaField);

        JButton agregarArtistaBtn = new JButton("Agregar Artista");
        agregarArtistaBtn.setBounds(200, 250, 150, 30);
        panel.add(agregarArtistaBtn);

        JButton agregarCancionBtn = new JButton("Agregar Canción");
        agregarCancionBtn.setBounds(200, 290, 150, 30);
        panel.add(agregarCancionBtn);

        JButton guardarCancionBtn = new JButton("Guardar");
        guardarCancionBtn.setBounds(200, 330, 150, 30);
        panel.add(guardarCancionBtn);

        // Sección de "Listas de Reproducción"
        JLabel listasLabel = new JLabel("Listas de Reprod...");
        listasLabel.setBounds(400, 20, 150, 30);
        panel.add(listasLabel);

        JButton crearListaBtn = new JButton("Crear list...");
        crearListaBtn.setBounds(400, 60, 100, 30);
        panel.add(crearListaBtn);

        JLabel nombreListaLabel = new JLabel("Nombre");
        nombreListaLabel.setBounds(400, 110, 100, 30);
        panel.add(nombreListaLabel);

        JTextField nombreListaField = new JTextField();
        nombreListaField.setBounds(400, 140, 100, 30);
        panel.add(nombreListaField);

        JButton guardarListaBtn = new JButton("Guardar");
        guardarListaBtn.setBounds(400, 180, 100, 30);
        panel.add(guardarListaBtn);

        // Agregar panel al marco principal
        frame.add(panel);

        // Hacer visible el marco principal
        frame.setVisible(true);
    }
}
