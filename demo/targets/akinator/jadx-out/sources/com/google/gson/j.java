package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class j implements FieldNamingStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final c f30056b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f30057c;

    static {
        c cVar = new c();
        f30056b = cVar;
        f30057c = new j[]{cVar, new j() { // from class: com.google.gson.d
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return j.b(field.getName());
            }
        }, new j() { // from class: com.google.gson.e
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return j.b(j.a(field.getName(), ' '));
            }
        }, new j() { // from class: com.google.gson.f
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return j.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new j() { // from class: com.google.gson.g
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return j.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new j() { // from class: com.google.gson.h
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return j.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new j() { // from class: com.google.gson.i
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return j.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (!Character.isLetter(cCharAt)) {
                i10++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f30057c.clone();
    }
}
