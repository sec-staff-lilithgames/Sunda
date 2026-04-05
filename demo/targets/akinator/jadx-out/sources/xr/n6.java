package xr;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f92811a = Logger.getLogger(n6.class.getName());

    public static Object a(JsonReader jsonReader) throws IOException {
        mh.p1.checkState(jsonReader.hasNext(), "unexpected end of JSON");
        switch (m6.f92790a[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(a(jsonReader));
                }
                mh.p1.checkState(jsonReader.peek() == JsonToken.END_ARRAY, "Bad token: " + jsonReader.getPath());
                jsonReader.endArray();
                return Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), a(jsonReader));
                }
                mh.p1.checkState(jsonReader.peek() == JsonToken.END_OBJECT, "Bad token: " + jsonReader.getPath());
                jsonReader.endObject();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException("Bad token: " + jsonReader.getPath());
        }
    }

    public static Object parse(String str) throws IOException {
        Logger logger = f92811a;
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            Object objA = a(jsonReader);
            try {
                return objA;
            } catch (IOException e10) {
                return objA;
            }
        } finally {
            try {
                jsonReader.close();
            } catch (IOException e102) {
                logger.log(Level.WARNING, "Failed to close", (Throwable) e102);
            }
        }
    }
}
