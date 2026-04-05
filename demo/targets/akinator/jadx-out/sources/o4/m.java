package o4;

import androidx.datastore.preferences.protobuf.f1;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.h2;
import kotlin.jvm.internal.e0;
import o4.j;
import tu.t;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f77487a = new m();

    @Override // k4.h2
    public Object readFrom(InputStream inputStream, zu.d<? super j> dVar) throws IOException {
        n4.i from = n4.f.f75616a.readFrom(inputStream);
        d dVarCreateMutable = k.createMutable(new j.b[0]);
        Map<String, n4.p> preferencesMap = from.getPreferencesMap();
        e0.checkNotNullExpressionValue(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry<String, n4.p> entry : preferencesMap.entrySet()) {
            String name = entry.getKey();
            n4.p value = entry.getValue();
            e0.checkNotNullExpressionValue(name, "name");
            e0.checkNotNullExpressionValue(value, "value");
            n4.o valueCase = value.getValueCase();
            switch (valueCase == null ? -1 : l.$EnumSwitchMapping$0[valueCase.ordinal()]) {
                case -1:
                    throw new k4.e("Value case is null.", null, 2, null);
                case 0:
                default:
                    throw new t();
                case 1:
                    dVarCreateMutable.set(n.booleanKey(name), Boolean.valueOf(value.getBoolean()));
                    break;
                case 2:
                    dVarCreateMutable.set(n.floatKey(name), Float.valueOf(value.getFloat()));
                    break;
                case 3:
                    dVarCreateMutable.set(n.doubleKey(name), Double.valueOf(value.getDouble()));
                    break;
                case 4:
                    dVarCreateMutable.set(n.intKey(name), Integer.valueOf(value.getInteger()));
                    break;
                case 5:
                    dVarCreateMutable.set(n.longKey(name), Long.valueOf(value.getLong()));
                    break;
                case 6:
                    j.a aVarStringKey = n.stringKey(name);
                    String string = value.getString();
                    e0.checkNotNullExpressionValue(string, "value.string");
                    dVarCreateMutable.set(aVarStringKey, string);
                    break;
                case 7:
                    j.a aVarStringSetKey = n.stringSetKey(name);
                    List<String> stringsList = value.getStringSet().getStringsList();
                    e0.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                    dVarCreateMutable.set(aVarStringSetKey, y0.toSet(stringsList));
                    break;
                case 8:
                    j.a aVarByteArrayKey = n.byteArrayKey(name);
                    byte[] byteArray = value.getBytes().toByteArray();
                    e0.checkNotNullExpressionValue(byteArray, "value.bytes.toByteArray()");
                    dVarCreateMutable.set(aVarByteArrayKey, byteArray);
                    break;
                case 9:
                    throw new k4.e("Value not set.", null, 2, null);
            }
        }
        return dVarCreateMutable.toPreferences();
    }

    @Override // k4.h2
    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, zu.d dVar) {
        return writeTo((j) obj, outputStream, (zu.d<? super x0>) dVar);
    }

    @Override // k4.h2
    public j getDefaultValue() {
        return k.createEmpty();
    }

    public Object writeTo(j jVar, OutputStream outputStream, zu.d<? super x0> dVar) throws IOException {
        f1 f1VarBuild;
        Map<j.a, Object> mapAsMap = jVar.asMap();
        n4.g gVarNewBuilder = n4.i.newBuilder();
        for (Map.Entry<j.a, Object> entry : mapAsMap.entrySet()) {
            j.a key = entry.getKey();
            Object value = entry.getValue();
            String name = key.getName();
            if (value instanceof Boolean) {
                f1VarBuild = n4.p.newBuilder().setBoolean(((Boolean) value).booleanValue()).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                f1VarBuild = n4.p.newBuilder().setFloat(((Number) value).floatValue()).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                f1VarBuild = n4.p.newBuilder().setDouble(((Number) value).doubleValue()).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                f1VarBuild = n4.p.newBuilder().setInteger(((Number) value).intValue()).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                f1VarBuild = n4.p.newBuilder().setLong(((Number) value).longValue()).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                f1VarBuild = n4.p.newBuilder().setString((String) value).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                n4.n nVarNewBuilder = n4.p.newBuilder();
                n4.k kVarNewBuilder = n4.l.newBuilder();
                e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                f1VarBuild = nVarNewBuilder.setStringSet(kVarNewBuilder.addAllStrings((Set) value)).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                f1VarBuild = n4.p.newBuilder().setBytes(x.copyFrom((byte[]) value)).build();
                e0.checkNotNullExpressionValue(f1VarBuild, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            gVarNewBuilder.putPreferences(name, (n4.p) f1VarBuild);
        }
        ((n4.i) gVarNewBuilder.build()).writeTo(outputStream);
        return x0.f87415a;
    }
}
