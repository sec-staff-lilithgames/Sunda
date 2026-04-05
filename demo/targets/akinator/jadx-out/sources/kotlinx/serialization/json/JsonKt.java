package kotlinx.serialization.json;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonKt {
    private static final String defaultDiscriminator = "type";
    private static final String defaultIndent = "    ";

    public static final Json Json(Json from, l builderAction) {
        e0.checkNotNullParameter(from, "from");
        e0.checkNotNullParameter(builderAction, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder(from);
        builderAction.invoke(jsonBuilder);
        return new JsonImpl(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static /* synthetic */ Json Json$default(Json json, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            json = Json.Default;
        }
        return Json(json, lVar);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(Json json, JsonElement json2) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(json2, "json");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) json.decodeFromJsonElement(SerializersKt.serializer(serializersModule, (KType) null), json2);
    }

    public static final /* synthetic */ <T> JsonElement encodeToJsonElement(Json json, T t10) {
        e0.checkNotNullParameter(json, "<this>");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return json.encodeToJsonElement(SerializersKt.serializer(serializersModule, (KType) null), t10);
    }
}
