package com.bykv.vk.openvk.preload.a;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16773a = new b("IDENTITY") { // from class: com.bykv.vk.openvk.preload.a.b.1
        {
            byte b10 = 0;
        }

        @Override // com.bykv.vk.openvk.preload.a.c
        public final String a(Field field) {
            return field.getName();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static b f16774b = new b("UPPER_CAMEL_CASE") { // from class: com.bykv.vk.openvk.preload.a.b.2
        {
            int i10 = 1;
            byte b10 = 0;
        }

        @Override // com.bykv.vk.openvk.preload.a.c
        public final String a(Field field) {
            return b.a(field.getName());
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static b f16775c = new b("UPPER_CAMEL_CASE_WITH_SPACES") { // from class: com.bykv.vk.openvk.preload.a.b.3
        {
            int i10 = 2;
            byte b10 = 0;
        }

        @Override // com.bykv.vk.openvk.preload.a.c
        public final String a(Field field) {
            return b.a(b.a(field.getName(), " "));
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static b f16776d = new b("LOWER_CASE_WITH_UNDERSCORES") { // from class: com.bykv.vk.openvk.preload.a.b.4
        {
            int i10 = 3;
            byte b10 = 0;
        }

        @Override // com.bykv.vk.openvk.preload.a.c
        public final String a(Field field) {
            return b.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static b f16777e = new b("LOWER_CASE_WITH_DASHES") { // from class: com.bykv.vk.openvk.preload.a.b.5
        {
            int i10 = 4;
            byte b10 = 0;
        }

        @Override // com.bykv.vk.openvk.preload.a.c
        public final String a(Field field) {
            return b.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static b f16778f = new b("LOWER_CASE_WITH_DOTS") { // from class: com.bykv.vk.openvk.preload.a.b.6
        {
            int i10 = 5;
            byte b10 = 0;
        }

        @Override // com.bykv.vk.openvk.preload.a.c
        public final String a(Field field) {
            return b.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    private b(String str, int i10) {
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public /* synthetic */ b(String str, int i10, byte b10) {
        this(str, i10);
    }

    public static String a(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length) {
            i10++;
        }
        char cCharAt = str.charAt(i10);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i10 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
    }
}
