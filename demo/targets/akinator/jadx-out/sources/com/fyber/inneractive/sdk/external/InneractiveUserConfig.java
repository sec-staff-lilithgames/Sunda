package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveUserConfig {

    /* renamed from: a, reason: collision with root package name */
    public int f23504a = -1;

    /* renamed from: b, reason: collision with root package name */
    public Gender f23505b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f23506c = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i10) {
        return i10 >= 1 && i10 <= 120;
    }

    public int getAge() {
        return this.f23504a;
    }

    public Gender getGender() {
        return this.f23505b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f23506c;
    }

    public InneractiveUserConfig setAge(int i10) {
        if (ageIsValid(i10)) {
            this.f23504a = i10;
            return this;
        }
        IAlog.f("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        return this;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f23505b = gender;
            return this;
        }
        IAlog.f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
            return this;
        }
        this.f23506c = str;
        return this;
    }
}
