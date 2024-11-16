package es.dominajava;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pedaleando {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();

        Bicicleta bici1 = new Bicicleta("ABK", "Verona", 26, 1, true);

        System.out.println("bici1: " + bici1);

        String jsonBici1 = gson.toJson(bici1);
        System.out.println("jsonBici1: " + jsonBici1);

        Bicicleta reconstruida = gson.fromJson(jsonBici1, Bicicleta.class);
        System.out.println("JSON: " + jsonBici1);
        System.out.println();

        Ciclista miguel = new Ciclista(
                "Miguel",
                new Date(new GregorianCalendar(1975, Calendar.JUNE, 8).getTimeInMillis()),
                LocalDate.now()
        );

        miguel.anadirBicicleta(bici1);

        Bicicleta bici2 = new Bicicleta("ABK", "Verona", 26, 1, true);
        miguel.anadirBicicleta(bici2);
        System.out.println("ciclista: " + miguel);

        String jsonCiclista = gson.toJson(miguel);
        System.out.println(jsonCiclista);

        Ciclista reconstruido = gson.fromJson(jsonCiclista, Ciclista.class);

    }

}

class LocalDateAdapter extends TypeAdapter<LocalDate> {

    @Override
    public void write(final JsonWriter jsonWriter, final LocalDate localDate) throws IOException {
        if (localDate == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(localDate.toString());
        }
    }

    @Override
    public LocalDate read(final JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        } else {
            return LocalDate.parse(jsonReader.nextString());
        }
    }
}
