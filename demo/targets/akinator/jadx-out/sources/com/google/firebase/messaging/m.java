package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.Editable;
import com.airbnb.lottie.LottieAnimationView;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.activities.SeveralCharactersProposalActivity;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.inmobi.media.C2746e3;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import lb.e;
import o6.h1;
import o9.j8;
import o9.n8;
import o9.p8;
import o9.s8;
import org.json.JSONObject;
import pw.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class m implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29834c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29835e;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f29833b = i10;
        this.f29834c = obj;
        this.f29835e = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        boolean zAccess$resetWorkerStatus = false;
        switch (this.f29833b) {
            case 0:
                return Integer.valueOf(g0.a().startMessagingService((Context) this.f29834c, (Intent) this.f29835e));
            case 1:
                return VungleThreadPoolExecutor.Companion.m3608getWrappedCallableWithFallback$lambda0((Callable) this.f29834c, (kv.a) this.f29835e);
            case 2:
                nj.q0 q0Var = (nj.q0) this.f29834c;
                AbstractMessageLite abstractMessageLite = (AbstractMessageLite) this.f29835e;
                synchronized (q0Var) {
                    FileOutputStream fileOutputStreamOpenFileOutput = q0Var.f77000a.openFileOutput(q0Var.f77001b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(abstractMessageLite.toByteArray());
                        fileOutputStreamOpenFileOutput.close();
                    } finally {
                    }
                }
                return abstractMessageLite;
            case 3:
                nj.q0 q0Var2 = (nj.q0) this.f29834c;
                Parser parser = (Parser) this.f29835e;
                synchronized (q0Var2) {
                    try {
                        FileInputStream fileInputStreamOpenFileInput = q0Var2.f77000a.openFileInput(q0Var2.f77001b);
                        try {
                            AbstractMessageLite abstractMessageLite2 = (AbstractMessageLite) parser.parseFrom(fileInputStreamOpenFileInput);
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            return abstractMessageLite2;
                        } catch (Throwable th2) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException | FileNotFoundException e10) {
                        nj.j0.logi("Recoverable exception while reading cache: " + e10.getMessage());
                        return null;
                    }
                }
            case 4:
                h1.b bVar = (h1.b) this.f29834c;
                h1 h1Var = (h1) this.f29835e;
                if (bVar instanceof h1.b.C0755b) {
                    zAccess$resetWorkerStatus = h1.access$onWorkFinished(h1Var, ((h1.b.C0755b) bVar).getResult());
                } else if (bVar instanceof h1.b.a) {
                    h1Var.setFailed(((h1.b.a) bVar).getResult());
                } else {
                    if (!(bVar instanceof h1.b.c)) {
                        throw new tu.t();
                    }
                    zAccess$resetWorkerStatus = h1.access$resetWorkerStatus(h1Var, ((h1.b.c) bVar).getReason());
                }
                return Boolean.valueOf(zAccess$resetWorkerStatus);
            case 5:
                AccountDatabase accountDatabase = (AccountDatabase) this.f29834c;
                aa.c cVar = (aa.c) this.f29835e;
                int trouve0ForSpecificThemeLang = accountDatabase.getDao().getTrouve0ForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                int trouve1ForSpecificThemeLang = accountDatabase.getDao().getTrouve1ForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                int trouve2ForSpecificThemeLang = accountDatabase.getDao().getTrouve2ForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                int trouve3ForSpecificThemeLang = accountDatabase.getDao().getTrouve3ForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                int trouve4ForSpecificThemeLang = accountDatabase.getDao().getTrouve4ForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                if (trouve0ForSpecificThemeLang == 1) {
                    cVar.getListPerso().get(0).setIsFound(true);
                }
                if (trouve1ForSpecificThemeLang == 1) {
                    cVar.getListPerso().get(1).setIsFound(true);
                }
                if (trouve2ForSpecificThemeLang == 1) {
                    cVar.getListPerso().get(2).setIsFound(true);
                }
                if (trouve3ForSpecificThemeLang == 1) {
                    cVar.getListPerso().get(3).setIsFound(true);
                }
                if (trouve4ForSpecificThemeLang == 1) {
                    cVar.getListPerso().get(4).setIsFound(true);
                }
                return 0;
            case 6:
                SeveralCharactersProposalActivity severalCharactersProposalActivity = (SeveralCharactersProposalActivity) this.f29834c;
                ArrayList arrayList = (ArrayList) this.f29835e;
                int i10 = SeveralCharactersProposalActivity.N;
                severalCharactersProposalActivity.getClass();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inTempStorage = new byte[16384];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String picturePath = ((e.b) it.next()).getPicturePath();
                    File cacheDir = severalCharactersProposalActivity.getCacheDir();
                    try {
                        URL url = new URL(picturePath);
                        URLConnection uRLConnectionOpenConnection = url.openConnection();
                        uRLConnectionOpenConnection.setConnectTimeout(5000);
                        uRLConnectionOpenConnection.connect();
                        uRLConnectionOpenConnection.getContentLength();
                        bufferedInputStream = new BufferedInputStream(url.openStream(), Segment.SIZE);
                        fileOutputStream = new FileOutputStream(new File(cacheDir, "tempimage"));
                        bArr = new byte[1024];
                    } catch (FileNotFoundException | MalformedURLException | IOException unused) {
                    }
                    while (true) {
                        int i11 = bufferedInputStream.read(bArr);
                        if (i11 != -1) {
                            fileOutputStream.write(bArr, 0, i11);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            bufferedInputStream.close();
                            severalCharactersProposalActivity.H.add(BitmapFactory.decodeFile(severalCharactersProposalActivity.getCacheDir() + "/tempimage", options));
                        }
                    }
                }
                return 0;
            case 7:
                j8 j8Var = (j8) this.f29834c;
                ArrayList arrayList2 = (ArrayList) this.f29835e;
                j8Var.getClass();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inPurgeable = true;
                options2.inInputShareable = true;
                options2.inTempStorage = new byte[16384];
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    j8Var.f78123b.downloadFile(((e.b) it2.next()).getPicturePath(), j8Var.f78123b.getCacheDir(), "tempimage");
                    j8Var.f78273i.add(BitmapFactory.decodeFile(j8Var.f78123b.getCacheDir() + "/tempimage", options2));
                }
                return 0;
            case 8:
                n8 n8Var = (n8) this.f29834c;
                Editable editable = (Editable) this.f29835e;
                p8 p8Var = n8Var.f78405b;
                ReentrantLock reentrantLock = p8Var.f78447i;
                reentrantLock.lock();
                ArrayList<String> arrayList3 = p8Var.f78445g;
                arrayList3.clear();
                if (editable.length() >= 3) {
                    ca.o.sharedInstance().getCurrentSession().getAutocompletionSuggestionsFromString(editable.toString(), arrayList3);
                }
                reentrantLock.unlock();
                return 0;
            case 9:
                s8 s8Var = (s8) this.f29834c;
                ArrayList arrayList4 = (ArrayList) this.f29835e;
                s8Var.getClass();
                BitmapFactory.Options options3 = new BitmapFactory.Options();
                options3.inPurgeable = true;
                options3.inInputShareable = true;
                options3.inTempStorage = new byte[16384];
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    s8Var.f78123b.downloadFile(((e.b) it3.next()).getPicturePath(), s8Var.f78123b.getCacheDir(), "tempimage");
                    s8Var.f78541h.add(BitmapFactory.decodeFile(s8Var.f78123b.getCacheDir() + "/tempimage", options3));
                }
                return 0;
            case 10:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f29834c;
                String str = (String) this.f29835e;
                return lottieAnimationView.f12488l ? r7.o.fromAssetSync(lottieAnimationView.getContext(), str) : r7.o.fromAssetSync(lottieAnimationView.getContext(), str, null);
            case 11:
                return r7.o.fromJsonStringSync((String) this.f29834c, (String) this.f29835e);
            case 12:
                return r7.o.fromJsonReaderSync((d8.c) this.f29834c, (String) this.f29835e);
            case 13:
                return r7.o.fromJsonSourceSync((b1) this.f29834c, (String) this.f29835e);
            case 14:
                return r7.o.fromJsonInputStreamSync((InputStream) this.f29834c, (String) this.f29835e);
            case 15:
                return r7.o.fromJsonSync((JSONObject) this.f29834c, (String) this.f29835e);
            default:
                return C2746e3.a((xv.l0) this.f29834c, (xv.o0) this.f29835e);
        }
    }
}
