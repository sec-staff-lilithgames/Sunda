package ib;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import gb.c;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;
import ya.b;
import ya.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f59445a;

    /* renamed from: b, reason: collision with root package name */
    public final c f59446b = new c();

    public a(Context context) {
        this.f59445a = context.getSharedPreferences("odt_storage", 0);
    }

    public final void a(String str) {
        try {
            Pair pairA = this.f59446b.a(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(pairA.first).put(pairA.second);
            this.f59445a.edit().putString("odt", jSONArray.toString()).apply();
        } catch (IOException e10) {
            e = e10;
            b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidKeyException e12) {
            e = e12;
            b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchPaddingException e14) {
            e = e14;
            b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (Exception e15) {
            b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e15, ya.c.FAILED_STORE_ENCRYPTED_DATA));
        }
    }

    public final String a() throws JSONException {
        String string = this.f59445a.getString("odt", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                String string2 = jSONArray.getString(0);
                return this.f59446b.a(jSONArray.getString(1), Base64.decode(string2, 0));
            } catch (IOException e10) {
                e = e10;
                b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (InvalidKeyException e12) {
                e = e12;
                b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (NoSuchPaddingException e14) {
                e = e14;
                b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (JSONException e15) {
                e = e15;
                b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e, ya.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (Exception e16) {
                b.a(d.ENCRYPTION_EXCEPTION, fb.a.a(e16, ya.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            }
        }
        return "";
    }
}
