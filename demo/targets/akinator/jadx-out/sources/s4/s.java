package s4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f85443o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f85444p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static volatile s f85445q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile boolean f85446r;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f85447a;

    /* renamed from: b, reason: collision with root package name */
    public final z.g f85448b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f85449c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f85450d;

    /* renamed from: e, reason: collision with root package name */
    public final i f85451e;

    /* renamed from: f, reason: collision with root package name */
    public final p f85452f;

    /* renamed from: g, reason: collision with root package name */
    public final r f85453g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f85454h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f85455i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f85456j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f85457k;

    /* renamed from: l, reason: collision with root package name */
    public final int f85458l;

    /* renamed from: m, reason: collision with root package name */
    public final int f85459m;

    /* renamed from: n, reason: collision with root package name */
    public final m f85460n;

    public s(k kVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f85447a = reentrantReadWriteLock;
        this.f85449c = 3;
        this.f85454h = kVar.f85412c;
        this.f85455i = kVar.f85413d;
        this.f85456j = kVar.f85414e;
        this.f85457k = kVar.f85416g;
        this.f85458l = kVar.f85417h;
        p pVar = kVar.f85410a;
        this.f85452f = pVar;
        int i10 = kVar.f85418i;
        this.f85459m = i10;
        this.f85460n = kVar.f85419j;
        this.f85450d = new Handler(Looper.getMainLooper());
        z.g gVar = new z.g();
        this.f85448b = gVar;
        r rVar = kVar.f85411b;
        this.f85453g = rVar == null ? new l() : rVar;
        z.g gVar2 = kVar.f85415f;
        if (gVar2 != null && !gVar2.isEmpty()) {
            gVar.addAll((Collection) kVar.f85415f);
        }
        i iVar = new i(this);
        this.f85451e = iVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f85449c = 0;
            } catch (Throwable th2) {
                this.f85447a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (getLoadState() == 0) {
            try {
                pVar.load(new h(iVar));
            } catch (Throwable th3) {
                b(th3);
            }
        }
    }

    public static s get() {
        s sVar;
        synchronized (f85443o) {
            sVar = f85445q;
            w3.i.checkState(sVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070 A[EDGE_INSN: B:92:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089, LOOP_LABEL: LOOP:2: B:49:0x0072->B:60:0x0089], EDGE_INSN: B:95:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s.handleDeleteSurroundingText(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean handleOnKeyDown(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : com.google.firebase.messaging.t.a(editable, keyEvent, true) : com.google.firebase.messaging.t.a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static s init(Context context) {
        return init(context, null);
    }

    public static boolean isConfigured() {
        return f85445q != null;
    }

    public static s reset(k kVar) {
        s sVar;
        synchronized (f85443o) {
            sVar = new s(kVar);
            f85445q = sVar;
        }
        return sVar;
    }

    public static void skipDefaultConfigurationLookup(boolean z10) {
        synchronized (f85444p) {
            f85446r = z10;
        }
    }

    public final boolean a() {
        return getLoadState() == 1;
    }

    public final void b(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f85447a.writeLock().lock();
        try {
            this.f85449c = 2;
            arrayList.addAll(this.f85448b);
            this.f85448b.clear();
            this.f85447a.writeLock().unlock();
            this.f85450d.post(new o(arrayList, this.f85449c, th2));
        } catch (Throwable th3) {
            this.f85447a.writeLock().unlock();
            throw th3;
        }
    }

    public String getAssetSignature() {
        w3.i.checkState(a(), "Not initialized yet");
        String strSourceSha = this.f85451e.f85396c.getMetadataList().sourceSha();
        return strSourceSha == null ? "" : strSourceSha;
    }

    public int getEmojiEnd(CharSequence charSequence, int i10) {
        com.google.firebase.messaging.t tVar = this.f85451e.f85395b;
        tVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            e0[] e0VarArr = (e0[]) spanned.getSpans(i10, i10 + 1, e0.class);
            if (e0VarArr.length > 0) {
                return spanned.getSpanEnd(e0VarArr[0]);
            }
        }
        return ((b0) tVar.f(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new b0(i10))).f85373c;
    }

    public int getEmojiMatch(CharSequence charSequence, int i10) {
        w3.i.checkState(a(), "Not initialized yet");
        w3.i.checkNotNull(charSequence, "sequence cannot be null");
        return this.f85451e.getEmojiMatch(charSequence, i10);
    }

    public int getEmojiSpanIndicatorColor() {
        return this.f85458l;
    }

    public int getEmojiStart(CharSequence charSequence, int i10) {
        com.google.firebase.messaging.t tVar = this.f85451e.f85395b;
        tVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            e0[] e0VarArr = (e0[]) spanned.getSpans(i10, i10 + 1, e0.class);
            if (e0VarArr.length > 0) {
                return spanned.getSpanStart(e0VarArr[0]);
            }
        }
        return ((b0) tVar.f(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new b0(i10))).f85372b;
    }

    public int getLoadState() {
        this.f85447a.readLock().lock();
        try {
            return this.f85449c;
        } finally {
            this.f85447a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence charSequence) {
        w3.i.checkState(a(), "Not initialized yet");
        w3.i.checkNotNull(charSequence, "sequence cannot be null");
        com.google.firebase.messaging.t tVar = this.f85451e.f85395b;
        return tVar.b(charSequence, ((o0) tVar.f29881c).f85431a.version()) == 1;
    }

    public boolean isEmojiSpanIndicatorEnabled() {
        return this.f85457k;
    }

    public void load() {
        w3.i.checkState(this.f85459m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (a()) {
            return;
        }
        this.f85447a.writeLock().lock();
        try {
            if (this.f85449c == 0) {
                return;
            }
            this.f85449c = 0;
            this.f85447a.writeLock().unlock();
            i iVar = this.f85451e;
            s sVar = iVar.f85408a;
            try {
                sVar.f85452f.load(new h(iVar));
            } catch (Throwable th2) {
                sVar.b(th2);
            }
        } finally {
            this.f85447a.writeLock().unlock();
        }
    }

    public CharSequence process(CharSequence charSequence) {
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public void registerInitCallback(n nVar) {
        w3.i.checkNotNull(nVar, "initCallback cannot be null");
        this.f85447a.writeLock().lock();
        try {
            if (this.f85449c == 1 || this.f85449c == 2) {
                this.f85450d.post(new o(Arrays.asList((n) w3.i.checkNotNull(nVar, "initCallback cannot be null")), this.f85449c, null));
            } else {
                this.f85448b.add(nVar);
            }
            this.f85447a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f85447a.writeLock().unlock();
            throw th2;
        }
    }

    public void unregisterInitCallback(n nVar) {
        w3.i.checkNotNull(nVar, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f85447a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f85448b.remove(nVar);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public void updateEditorInfo(EditorInfo editorInfo) {
        if (!a() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        i iVar = this.f85451e;
        iVar.getClass();
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iVar.f85396c.f85431a.version());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", iVar.f85408a.f85454h);
    }

    public static s init(Context context, b bVar) {
        s sVar;
        if (f85446r) {
            return f85445q;
        }
        if (bVar == null) {
            bVar = new b(null);
        }
        k kVarCreate = bVar.create(context);
        synchronized (f85444p) {
            try {
                if (!f85446r) {
                    if (kVarCreate != null) {
                        init(kVarCreate);
                    }
                    f85446r = true;
                }
                sVar = f85445q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public CharSequence process(CharSequence charSequence, int i10, int i11) {
        return process(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence process(CharSequence charSequence, int i10, int i11, int i12) {
        return process(charSequence, i10, i11, i12, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
    
        if (r9 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
    
        ((s4.q0) r17).endBatchEdit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011d, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011e, code lost:
    
        if (r9 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:31:0x0078, B:34:0x007d, B:36:0x0081, B:38:0x008e, B:43:0x00aa, B:45:0x00b2, B:47:0x00b5, B:49:0x00b9, B:51:0x00c5, B:52:0x00c8, B:54:0x00d6, B:60:0x00e4, B:61:0x00f1, B:63:0x0108, B:41:0x00a0), top: B:76:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:31:0x0078, B:34:0x007d, B:36:0x0081, B:38:0x008e, B:43:0x00aa, B:45:0x00b2, B:47:0x00b5, B:49:0x00b9, B:51:0x00c5, B:52:0x00c8, B:54:0x00d6, B:60:0x00e4, B:61:0x00f1, B:63:0x0108, B:41:0x00a0), top: B:76:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:31:0x0078, B:34:0x007d, B:36:0x0081, B:38:0x008e, B:43:0x00aa, B:45:0x00b2, B:47:0x00b5, B:49:0x00b9, B:51:0x00c5, B:52:0x00c8, B:54:0x00d6, B:60:0x00e4, B:61:0x00f1, B:63:0x0108, B:41:0x00a0), top: B:76:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #0 {all -> 0x009d, blocks: (B:31:0x0078, B:34:0x007d, B:36:0x0081, B:38:0x008e, B:43:0x00aa, B:45:0x00b2, B:47:0x00b5, B:49:0x00b9, B:51:0x00c5, B:52:0x00c8, B:54:0x00d6, B:60:0x00e4, B:61:0x00f1, B:63:0x0108, B:41:0x00a0), top: B:76:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence process(java.lang.CharSequence r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s.process(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    public static s reset(s sVar) {
        s sVar2;
        synchronized (f85443o) {
            f85445q = sVar;
            sVar2 = f85445q;
        }
        return sVar2;
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence charSequence, int i10) {
        w3.i.checkState(a(), "Not initialized yet");
        w3.i.checkNotNull(charSequence, "sequence cannot be null");
        return this.f85451e.f85395b.b(charSequence, i10) == 1;
    }

    public static s init(k kVar) {
        s sVar;
        s sVar2 = f85445q;
        if (sVar2 != null) {
            return sVar2;
        }
        synchronized (f85443o) {
            try {
                sVar = f85445q;
                if (sVar == null) {
                    sVar = new s(kVar);
                    f85445q = sVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
