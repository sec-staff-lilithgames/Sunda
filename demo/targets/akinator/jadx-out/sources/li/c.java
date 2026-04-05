package li;

import android.util.JsonReader;
import com.ironsource.C3191e4;
import j1.u;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ki.a0;
import ki.f2;
import wi.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ui.a f73380a = new e().configureWith(a0.f71121a).ignoreNullValues(true).build();

    public static f2.e.d.a.b.AbstractC0725e.AbstractC0727b a(JsonReader jsonReader) throws IOException {
        f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a abstractC0728aBuilder = f2.e.d.a.b.AbstractC0725e.AbstractC0727b.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC0728aBuilder.setOffset(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0728aBuilder.setSymbol(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0728aBuilder.setPc(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0728aBuilder.setFile(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0728aBuilder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0728aBuilder.build();
    }

    public static f2.c b(JsonReader jsonReader) throws IOException {
        f2.c.a aVarBuilder = f2.c.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(C3191e4.h.W)) {
                aVarBuilder.setKey(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarBuilder.setValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    public static f2.a c(JsonReader jsonReader) throws IOException {
        f2.a.b bVarBuilder = f2.a.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarBuilder.setBuildIdMappingForArch(d(jsonReader, new u(27)));
                    break;
                case "pid":
                    bVarBuilder.setPid(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarBuilder.setPss(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarBuilder.setRss(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarBuilder.setTimestamp(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarBuilder.setProcessName(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarBuilder.setReasonCode(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarBuilder.setTraceFile(jsonReader.nextString());
                    break;
                case "importance":
                    bVarBuilder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarBuilder.build();
    }

    public static List d(JsonReader jsonReader, b bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.parse(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ki.f2.e.d e(android.util.JsonReader r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.c.e(android.util.JsonReader):ki.f2$e$d");
    }

    public static f2.e.d.a.b.c f(JsonReader jsonReader) throws IOException {
        f2.e.d.a.b.c.AbstractC0722a abstractC0722aBuilder = f2.e.d.a.b.c.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(a(jsonReader));
                    }
                    jsonReader.endArray();
                    abstractC0722aBuilder.setFrames(Collections.unmodifiableList(arrayList));
                    break;
                case "reason":
                    abstractC0722aBuilder.setReason(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0722aBuilder.setType(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0722aBuilder.setCausedBy(f(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0722aBuilder.setOverflowCount(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0722aBuilder.build();
    }

    public static f2.e.d.a.c g(JsonReader jsonReader) throws IOException {
        f2.e.d.a.c.AbstractC0729a abstractC0729aBuilder = f2.e.d.a.c.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC0729aBuilder.setPid(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0729aBuilder.setProcessName(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0729aBuilder.setDefaultProcess(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0729aBuilder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0729aBuilder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ki.f2 h(android.util.JsonReader r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.c.h(android.util.JsonReader):ki.f2");
    }

    public f2.a applicationExitInfoFromJson(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f2.a aVarC = c(jsonReader);
                jsonReader.close();
                return aVarC;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String applicationExitInfoToJson(f2.a aVar) {
        return ((wi.c) f73380a).encode(aVar);
    }

    public f2.e.d eventFromJson(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f2.e.d dVarE = e(jsonReader);
                jsonReader.close();
                return dVarE;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String eventToJson(f2.e.d dVar) {
        return ((wi.c) f73380a).encode(dVar);
    }

    public f2 reportFromJson(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f2 f2VarH = h(jsonReader);
                jsonReader.close();
                return f2VarH;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String reportToJson(f2 f2Var) {
        return ((wi.c) f73380a).encode(f2Var);
    }
}
