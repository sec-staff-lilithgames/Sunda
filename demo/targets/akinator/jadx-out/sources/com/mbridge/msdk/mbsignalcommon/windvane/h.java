package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.mbsignalcommon.mapping.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h implements b, Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f41950a;

    /* renamed from: b, reason: collision with root package name */
    protected String f41951b;

    /* renamed from: d, reason: collision with root package name */
    protected Context f41953d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f41954e;

    /* renamed from: c, reason: collision with root package name */
    protected final int f41952c = 1;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f41955f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f41953d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f41954e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f41954e, str);
        if (aVarA != null) {
            aVarA.f41924b = this.f41954e;
            return aVarA;
        }
        Matcher matcher = this.f41950a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f41928f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f41926d = matcher.group(1);
                aVar.f41929g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f41927e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f41825k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f41927e = com.mbridge.msdk.mbsignalcommon.base.e.f41825k.get(aVar.f41927e);
                }
                aVar.f41924b = this.f41954e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f41951b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.f41925c;
        b.C0297b c0297b = aVar.f41923a;
        if (c0297b != null && obj != null) {
            c0297b.a(obj, aVar, TextUtils.isEmpty(aVar.f41928f) ? "{}" : aVar.f41928f);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f41924b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f41926d);
        if (jsObject == null) {
            return;
        }
        try {
            b.C0297b c0297bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f41953d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f41927e, Object.class, String.class);
            c0297bA.a();
            if (jsObject instanceof g) {
                aVar.f41923a = c0297bA;
                aVar.f41925c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f41955f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f41950a = pattern;
    }
}
