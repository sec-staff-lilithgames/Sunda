package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.TextFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f61995a = {BuildConfig.LIBRARY_PACKAGE_NAME, "com.explorestack"};

    public static Object a(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        try {
            if (fieldDescriptor.isRepeated() && (obj instanceof List)) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(a(fieldDescriptor, it.next()));
                }
                return jSONArray;
            }
            switch (q3.f61990a[fieldDescriptor.getJavaType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return obj;
                case 7:
                    return obj instanceof ByteString ? TextFormat.escapeBytes((ByteString) obj) : TextFormat.escapeBytes((byte[]) obj);
                case 8:
                    return ((Descriptors.GenericDescriptor) obj).getName();
                case 9:
                    return b((MessageOrBuilder) obj);
                default:
                    return "Unsupported type";
            }
        } catch (Throwable unused) {
            return "Parsing error";
        }
    }

    public static JSONObject b(MessageOrBuilder messageOrBuilder) throws JSONException {
        if (!(messageOrBuilder instanceof Any)) {
            Map<Descriptors.FieldDescriptor, Object> allFields = messageOrBuilder.getAllFields();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : allFields.entrySet()) {
                Descriptors.FieldDescriptor key = entry.getKey();
                try {
                    jSONObject.put(key.getName(), a(key, entry.getValue()));
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        }
        Any any = (Any) messageOrBuilder;
        String str = any.getTypeUrl().split("/")[r0.length - 1];
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                return b(any.unpack(Class.forName(f61995a[i10] + str.substring(str.indexOf(".")))));
            } catch (Exception unused2) {
            }
        }
        return new JSONObject();
    }
}
