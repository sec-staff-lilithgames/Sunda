package com.inmobi.media;

import com.ironsource.C3271ic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2885m7 extends X9 {

    /* renamed from: y, reason: collision with root package name */
    public final C2750e7 f33090y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2885m7(String url, C2750e7 data) {
        super(C3271ic.f36944b, url, (Te) null, true, (F5) null, com.ironsource.G5.L, 64);
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        this.f33090y = data;
    }

    public static String a(String str) throws IOException {
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
                sb2.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.inmobi.media.X9
    public final void f() {
        super.f();
        this.f32511t = false;
        this.f32512u = false;
        this.f32515x = false;
        try {
            this.f32503l = new JSONObject(a(this.f33090y.f32807a));
        } catch (FileNotFoundException unused) {
            String strO = j1.o2.o(new StringBuilder("File - "), this.f33090y.f32807a, " not found");
            Z9 response = new Z9();
            response.f32602d = new S9(EnumC3017u4.f33436s, strO);
            kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
            this.f32505n = response;
        } catch (IOException unused2) {
            String str = "IOException while reading file - " + this.f33090y.f32807a;
            Z9 response2 = new Z9();
            response2.f32602d = new S9(EnumC3017u4.f33436s, str);
            kotlin.jvm.internal.e0.checkNotNullParameter(response2, "response");
            this.f32505n = response2;
        } catch (JSONException unused3) {
            String str2 = "JSON exception while parsing file - " + this.f33090y.f32807a;
            Z9 response3 = new Z9();
            response3.f32602d = new S9(EnumC3017u4.f33436s, str2);
            kotlin.jvm.internal.e0.checkNotNullParameter(response3, "response");
            this.f32505n = response3;
        }
    }
}
