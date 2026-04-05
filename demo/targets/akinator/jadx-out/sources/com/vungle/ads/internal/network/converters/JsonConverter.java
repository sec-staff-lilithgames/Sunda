package com.vungle.ads.internal.network.converters;

import gv.d;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class JsonConverter<E> implements Converter<w0, E> {
    public static final Companion Companion = new Companion(null);
    private static final Json json = JsonKt.Json$default(null, JsonConverter$Companion$json$1.INSTANCE, 1, null);
    private final KType kType;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public JsonConverter(KType kType) {
        e0.checkNotNullParameter(kType, "kType");
        this.kType = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.Converter
    public E convert(w0 w0Var) throws IOException {
        if (w0Var != null) {
            try {
                String strString = w0Var.string();
                if (strString != null) {
                    E e10 = (E) json.decodeFromString(SerializersKt.serializer(Json.Default.getSerializersModule(), this.kType), strString);
                    d.closeFinally(w0Var, null);
                    return e10;
                }
            } finally {
            }
        }
        d.closeFinally(w0Var, null);
        return null;
    }
}
