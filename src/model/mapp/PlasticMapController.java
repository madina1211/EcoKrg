package model.mapp;

import com.dlsc.gmapsfx.GoogleMapView;
import com.dlsc.gmapsfx.javascript.event.GMapMouseEvent;
import com.dlsc.gmapsfx.javascript.event.UIEventType;
import com.dlsc.gmapsfx.javascript.object.*;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class PlasticMapController implements Initializable {

    @FXML
    private Label latitudeLabel;

    @FXML
    private Label longitudeLabel;

    @FXML
    private GoogleMapView googleMapView;

    private GoogleMap map;

    private DecimalFormat formatter = new DecimalFormat("###.00000");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        googleMapView.addMapInitializedListener(() -> configureMap());
    }

    protected void configureMap() {
        MapOptions mapOptions = new MapOptions();


        LatLong place = new LatLong(49.807678, 73.097992);

        /*
        mapOptions.center(place)
                .mapType(MapTypeIdEnum.ROADMAP)
                .zoom(16);
        */

        mapOptions.center(place)
                .mapType(MapTypeIdEnum.ROADMAP)
                .overviewMapControl(false)
                .panControl(false)
                .rotateControl(false)
                .scaleControl(false)
                .streetViewControl(false)
                .zoomControl(false)
                .zoom(18);

        map = googleMapView.createMap(mapOptions, false);

        MarkerOptions markerOptions = new MarkerOptions();

        markerOptions.position( place )
                .visible(Boolean.TRUE)
                .title("Plastic");

        Marker marker = new Marker( markerOptions );

        map.addMarker(marker);

        InfoWindowOptions infoWindowOptions = new InfoWindowOptions();
        infoWindowOptions.content("<h2>Промотход Сервис ТОО</h2>"
                + "Location: ул. Алиханова, д.5 офис 416<br>"
                + "Work time: 09:00 - 18:00" );

        InfoWindow fredWilkeInfoWindow = new InfoWindow(infoWindowOptions);

        fredWilkeInfoWindow.open(map, marker);

    }
}