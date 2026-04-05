package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29879a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29880b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29881c;

    /* renamed from: d, reason: collision with root package name */
    public Object f29882d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f29883e;

    public t(s4.o0 o0Var, s4.r rVar, s4.m mVar, boolean z10, int[] iArr, Set set) {
        this.f29880b = rVar;
        this.f29881c = o0Var;
        this.f29882d = mVar;
        this.f29879a = z10;
        this.f29883e = iArr;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            String str = new String(iArr2, 0, iArr2.length);
            f(str, 0, str.length(), 1, true, new s4.c0(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        s4.e0[] e0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (e0VarArr = (s4.e0[]) editable.getSpans(selectionStart, selectionEnd, s4.e0.class)) != null && e0VarArr.length > 0) {
                for (s4.e0 e0Var : e0VarArr) {
                    int spanStart = editable.getSpanStart(e0Var);
                    int spanEnd = editable.getSpanEnd(e0Var);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int b(CharSequence charSequence, int i10) {
        s4.d0 d0Var = new s4.d0(((s4.o0) this.f29881c).f85433c, this.f29879a, (int[]) this.f29883e);
        int length = charSequence.length();
        int iCharCount = 0;
        int i11 = 0;
        int i12 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iA = d0Var.a(iCodePointAt);
            s4.r0 r0Var = d0Var.f85377c.f85427b;
            if (iA == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i12 = 0;
            } else if (iA == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iA == 3) {
                r0Var = d0Var.f85378d.f85427b;
                if (r0Var.getCompatAdded() <= i10) {
                    i11++;
                }
            }
            if (r0Var != null && r0Var.getCompatAdded() <= i10) {
                i12++;
            }
        }
        if (i11 == 0) {
            if (d0Var.f85375a == 2 && d0Var.f85377c.f85427b != null && ((d0Var.f85380f > 1 || d0Var.c()) && d0Var.f85377c.f85427b.getCompatAdded() <= i10)) {
                return 1;
            }
            if (i12 == 0) {
                return 0;
            }
        }
        return 2;
    }

    public boolean c(CharSequence charSequence, int i10, int i11, s4.r0 r0Var) {
        if (r0Var.getHasGlyph() == 0) {
            r0Var.setHasGlyph(((s4.g) ((s4.m) this.f29882d)).hasGlyph(charSequence, i10, i11, r0Var.getSdkAdded()));
        }
        return r0Var.getHasGlyph() == 2;
    }

    public synchronized void d() {
        try {
            if (this.f29879a) {
                return;
            }
            Boolean boolG = g();
            this.f29882d = boolG;
            if (boolG == null) {
                s sVar = new s(this, 0);
                this.f29881c = sVar;
                ((bi.t) ((yi.d) this.f29880b)).subscribe(com.google.firebase.b.class, sVar);
            }
            this.f29879a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean e() {
        Boolean bool;
        try {
            d();
            bool = (Boolean) this.f29882d;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f29883e).f29726a.isDataCollectionDefaultEnabled();
    }

    public Object f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, s4.a0 a0Var) {
        int i13;
        s4.d0 d0Var = new s4.d0(((s4.o0) this.f29881c).f85433c, this.f29879a, (int[]) this.f29883e);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zHandleEmoji = true;
        loop0: while (true) {
            int iCodePointAt2 = iCodePointAt;
            while (true) {
                i13 = i10;
                while (i10 < i11 && i14 < i12 && zHandleEmoji) {
                    int iA = d0Var.a(iCodePointAt2);
                    if (iA == 1) {
                        i10 = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (i10 < i11) {
                            break;
                        }
                    } else if (iA == 2) {
                        int iCharCount = Character.charCount(iCodePointAt2) + i10;
                        if (iCharCount < i11) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                        }
                        i10 = iCharCount;
                    } else if (iA == 3) {
                        if (z10 || !c(charSequence, i13, i10, d0Var.f85378d.f85427b)) {
                            zHandleEmoji = a0Var.handleEmoji(charSequence, i13, i10, d0Var.f85378d.f85427b);
                            i14++;
                        }
                    }
                }
                break loop0;
            }
            iCodePointAt = Character.codePointAt(charSequence, i10);
        }
        if (d0Var.f85375a == 2 && d0Var.f85377c.f85427b != null && ((d0Var.f85380f > 1 || d0Var.c()) && i14 < i12 && zHandleEmoji && (z10 || !c(charSequence, i13, i10, d0Var.f85377c.f85427b)))) {
            a0Var.handleEmoji(charSequence, i13, i10, d0Var.f85377c.f85427b);
        }
        return a0Var.getResult();
    }

    public Boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context applicationContext = ((FirebaseMessaging) this.f29883e).f29726a.getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public t(FirebaseMessaging firebaseMessaging, yi.d dVar) {
        this.f29883e = firebaseMessaging;
        this.f29880b = dVar;
    }
}
