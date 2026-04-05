package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class h0 implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f29919b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f29920c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h0[] f29921e;

    static {
        d0 d0Var = new d0();
        f29919b = d0Var;
        e0 e0Var = new e0();
        f29920c = e0Var;
        f29921e = new h0[]{d0Var, e0Var, new h0() { // from class: com.google.gson.f0
            public static Double a(JsonReader jsonReader, String str) throws MalformedJsonException, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    StringBuilder sbO = e3.g.o("Cannot parse ", str, "; at path ");
                    sbO.append(jsonReader.getPreviousPath());
                    throw new u(sbO.toString(), e10);
                }
            }

            @Override // com.google.gson.h0, com.google.gson.i0
            public Number readNumber(JsonReader jsonReader) throws u, IOException {
                String strNextString = jsonReader.nextString();
                if (strNextString.indexOf(46) >= 0) {
                    return a(jsonReader, strNextString);
                }
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException unused) {
                    return a(jsonReader, strNextString);
                }
            }
        }, new h0() { // from class: com.google.gson.g0
            @Override // com.google.gson.h0, com.google.gson.i0
            public BigDecimal readNumber(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return mk.t.parseBigDecimal(strNextString);
                } catch (NumberFormatException e10) {
                    StringBuilder sbO = e3.g.o("Cannot parse ", strNextString, "; at path ");
                    sbO.append(jsonReader.getPreviousPath());
                    throw new u(sbO.toString(), e10);
                }
            }
        }};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f29921e.clone();
    }

    public abstract /* synthetic */ Number readNumber(JsonReader jsonReader) throws IOException;
}
