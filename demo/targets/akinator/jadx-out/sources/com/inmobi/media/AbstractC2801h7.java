package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.h7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2801h7 {
    public static final EnumC2784g7 a(String logLevel) {
        kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
        return sv.k0.equals(logLevel, "DEBUG", true) ? EnumC2784g7.f32871b : sv.k0.equals(logLevel, "ERROR", true) ? EnumC2784g7.f32872c : sv.k0.equals(logLevel, "INFO", true) ? EnumC2784g7.f32870a : sv.k0.equals(logLevel, "STATE", true) ? EnumC2784g7.f32873d : EnumC2784g7.f32872c;
    }
}
