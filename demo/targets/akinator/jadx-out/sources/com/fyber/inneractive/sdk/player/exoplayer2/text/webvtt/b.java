package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f25831a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f25832b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(String str) throws NumberFormatException {
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        return (Long.parseLong(strArrSplit[1]) + (j10 * 1000)) * 1000;
    }
}
