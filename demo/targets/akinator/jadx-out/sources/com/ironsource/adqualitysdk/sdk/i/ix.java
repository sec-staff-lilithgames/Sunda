package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.amazon.device.ads.DtbConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ix {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2819 = 6327984086712293453L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2820 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2821 = -3790727232008568432L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2822 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m2881(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m2890(dataOutputStream);
        int i10 = f2820 + 69;
        f2822 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static ir m2883(JSONObject jSONObject, String str) {
        f2820 = (f2822 + 43) % 128;
        try {
            HttpURLConnection httpURLConnectionM2880 = m2880(str);
            byte[] bArrM2882 = m2882(httpURLConnectionM2880, jSONObject);
            long jM3089 = jv.m3089();
            m2881(httpURLConnectionM2880, bArrM2882);
            String strM2879 = m2879(httpURLConnectionM2880);
            int responseCode = httpURLConnectionM2880.getResponseCode();
            String responseMessage = httpURLConnectionM2880.getResponseMessage();
            if (responseCode >= 400) {
                f2820 = (f2822 + 95) % 128;
                httpURLConnectionM2880.disconnect();
            }
            ir irVar = new ir(strM2879, responseCode, responseMessage, jv.m3089() - jM3089);
            f2822 = (f2820 + 29) % 128;
            return irVar;
        } catch (Throwable th2) {
            String strIntern = m2878("䒝ᑟ붅ᩈ䓓햪㻑庭䊩폦㒉僋", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2889("須꽊\uf6d5㹽䗫贤풀ᰛ⎋欴늶﨤Ŗ䢜遛ꟹ\uef6e㛼繗薐촌ᒥ尶掫\uaac6\uf254㦕䄺", View.resolveSizeAndState(0, 0, 0) + 14197).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m3145(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2886(String str) {
        if (str.length() <= 256) {
            f2820 = (f2822 + 103) % 128;
            return false;
        }
        int i10 = f2820 + 93;
        f2822 = i10 % 128;
        return i10 % 2 != 0;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ir m2888(String str) {
        f2822 = (f2820 + 43) % 128;
        try {
            HttpURLConnection httpURLConnectionM2885 = m2885(str);
            long jM3089 = jv.m3089();
            String strM2879 = m2879(httpURLConnectionM2885);
            int responseCode = httpURLConnectionM2885.getResponseCode();
            String responseMessage = httpURLConnectionM2885.getResponseMessage();
            if (responseCode >= 400) {
                int i10 = f2820 + 3;
                f2822 = i10 % 128;
                if (i10 % 2 == 0) {
                    httpURLConnectionM2885.disconnect();
                    throw null;
                }
                httpURLConnectionM2885.disconnect();
            }
            return new ir(strM2879, responseCode, responseMessage, jv.m3089() - jM3089);
        } catch (Throwable th2) {
            String strIntern = m2878("䒝ᑟ붅ᩈ䓓햪㻑庭䊩폦㒉僋", View.getDefaultSize(0, 0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2878("൞恶\ue3ab炨ഛꆔ惹㑷୬Ꞇ檸㨽ư긂汢⇶Ό됆瘬➽ᐪ뫆翹\u2d7dቯ胓䆮ጫ⢪蝜䬫", ViewConfiguration.getEdgeSlop() >> 16).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m3145(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2887(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            e = e11;
            gZIPOutputStream2 = gZIPOutputStream;
            throw new RuntimeException(e);
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                    f2820 = (f2822 + 69) % 128;
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2882(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        String strM2884 = m2884(jSONObject);
        byte[] bytes = strM2884.getBytes(m2878("㟺襔࿀㨭㞯䢐貦纰ㆂ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        if (!m2886(strM2884)) {
            return bytes;
        }
        f2820 = (f2822 + 37) % 128;
        httpURLConnection.setRequestProperty(m2889("頎⧓﯁跪忬\ue196뎟䗷ក\ud95a歄㵹콥鄙⌍\uf535", 45553 - Color.blue(0)).intern(), m2878("䷞⑅讲\uf7b2䶹\ue5afࣻ덲", TextUtils.getTrimmedLength("")).intern());
        byte[] bArrM2887 = m2887(bytes);
        f2820 = (f2822 + 9) % 128;
        return bArrM2887;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m2890(Closeable closeable) {
        int i10 = (f2822 + 89) % 128;
        f2820 = i10;
        if (closeable != null) {
            int i11 = i10 + 73;
            f2822 = i11 % 128;
            try {
                if (i11 % 2 != 0) {
                    closeable.close();
                    f2822 = (f2820 + 25) % 128;
                } else {
                    closeable.close();
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m2885(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2889("頊⎙\uef3b", 48017 - View.MeasureSpec.getMode(0)).intern());
        f2822 = (f2820 + 47) % 128;
        return httpURLConnection;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m2880(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2878("絽쏁精ဂ紭Ȟ祮哦", ViewConfiguration.getEdgeSlop() >> 16).intern());
        httpURLConnection.setRequestProperty(m2889("頎⟿\ue799Ɪ杜❲\ue717ꝫ曱⛱\ue69fꙗ", TextUtils.indexOf("", "", 0, 0) + 49117).intern(), m2889("頬\ud9d2ᯣ巬龘톅Ꮆ喰靜쥅୵䴧輓석̰䔢蚆\uf8b2㫠粘뺀\uf0a4㊴瑑뙑\ue827⩾氌긏\ue073≷", (ViewConfiguration.getLongPressTimeout() >> 16) + 16879).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(DtbConstants.NETWORK_READ_TIMEOUT);
        httpURLConnection.setReadTimeout(DtbConstants.NETWORK_READ_TIMEOUT);
        int i10 = f2822 + 75;
        f2820 = i10 % 128;
        if (i10 % 2 == 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2889(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2819);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2884(JSONObject jSONObject) throws NoSuchAlgorithmException, InvalidKeyException {
        String string = jSONObject.toString();
        String strM3093 = jw.m3093(string);
        StringBuilder sbU = o2.u(string.substring(0, string.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)));
        sbU.append(m2878("ᡨ뗽ᥦ㣋ᡄ瑏騮簈Ḋ爗逤", TextUtils.lastIndexOf("", '0', 0) + 1).intern());
        sbU.append(strM3093);
        String strI = com.google.android.gms.internal.play_billing.a.i(m2878("\ue675\u1aae呭ᐃ\ue657\udb43", ViewConfiguration.getWindowTouchSlop() >> 8), sbU);
        f2820 = (f2822 + 77) % 128;
        return strI;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2879(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        String string = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    f2820 = (f2822 + 93) % 128;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append('\r');
                            f2820 = (f2822 + 41) % 128;
                        }
                        stringBuffer.append(line);
                    }
                    string = stringBuffer.toString();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        k.m3145(m2878("䒝ᑟ붅ᩈ䓓햪㻑庭䊩폦㒉僋", View.combineMeasuredStates(0, 0)).intern(), m2878("킡喟郍駱탤鑽\u139f뷅횓鉯\u19ca뎏\udc55鯻ἄꡄ숆臯՟긏짒轿ಂ꓄쾒딪", ViewConfiguration.getDoubleTapTimeout() >> 16).intern(), th);
                        return string;
                    } finally {
                        m2890(inputStream);
                        m2890(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            bufferedReader = null;
        }
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m2877(ir irVar) {
        int i10 = f2822 + 53;
        f2820 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (irVar == null) {
            return null;
        }
        String strM2840 = irVar.m2840();
        int i11 = f2822 + 23;
        f2820 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM2840;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2878(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2821, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2821));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
