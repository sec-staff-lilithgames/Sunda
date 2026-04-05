package ca;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static t f12009c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f12010d = {"akinator_concentration_intense", "akinator_confiant", "akinator_deception", "akinator_defi", "akinator_etonnement", "akinator_inspiration_forte", "akinator_inspiration_legere", "akinator_leger_decouragement", "akinator_mobile", "akinator_serein", "akinator_surprise", "akinator_tension", "akinator_triomphe", "akinator_vrai_decouragement"};

    /* renamed from: a, reason: collision with root package name */
    public int f12011a;

    /* renamed from: b, reason: collision with root package name */
    public int f12012b;

    public static int a(String str, File file, String str2) throws IOException {
        try {
            URL url = new URL(str);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
            uRLConnectionOpenConnection.setReadTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
            uRLConnectionOpenConnection.connect();
            uRLConnectionOpenConnection.getContentLength();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), Segment.SIZE);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str2));
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    return 0;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (FileNotFoundException e10) {
            Timber.e(e10);
            return 404;
        } catch (MalformedURLException e11) {
            Timber.e(e11);
            return 2;
        } catch (IOException e12) {
            Timber.e(e12);
            return 2;
        }
    }

    public static int b(File file, String str, String str2) throws IOException {
        int iA = a("https://photos.clarinea.fr/assets/" + str, file, str2);
        if (iA == 0) {
            return 0;
        }
        int iA2 = a("https://assets-mobile.akinator.com/" + str, file, str2);
        if (iA2 == 0) {
            return 0;
        }
        if (iA == 1 || (iA == 404 && iA2 == 404)) {
            return iA;
        }
        return 2;
    }

    public static boolean c(String str, String str2) {
        return new File(AkApplication.getAppContext().getDir(str, 0).toString() + "/" + str2).exists();
    }

    public static t sharedInstance() {
        if (f12009c == null) {
            t tVar = new t();
            tVar.f12011a = 512;
            tVar.f12012b = 48;
            f12009c = tVar;
        }
        return f12009c;
    }

    public final String d() {
        int i10 = this.f12011a;
        return (i10 <= 1081 || this.f12012b <= 144) ? (i10 <= 600 || this.f12012b <= 96) ? "512/" : "800/" : "1200/";
    }

    public Bitmap getAkiBitmap(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            return BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("apoils", 0) + "/" + str + ".png", options);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public Bitmap getClothBitmap(String str, String str2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("tenues", 0) + "/" + str2 + "_" + str + ".png", options);
            if (bitmapDecodeFile != null) {
                return bitmapDecodeFile;
            }
            return BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("tenues", 0) + "/" + str2 + "_orient.png", options);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public Bitmap getHatBitmap(String str, String str2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("chapeaux", 0) + "/" + str2 + "_chapeau_" + str + ".png", options);
            if (bitmapDecodeFile != null) {
                return bitmapDecodeFile;
            }
            return BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("chapeaux", 0) + "/" + str2 + "_chapeau_turban.png", options);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public Bitmap getSubjectBackground(int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        return BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("subjbg", 0) + "/" + i10 + ".png", options);
    }

    public Bitmap getSubjectBackgroundEndgame(int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        return BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("subjbgend", 0) + "/" + i10 + ".png", options);
    }

    public Bitmap getSubjectIcon(int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        return BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("subjicon", 0) + "/" + i10 + ".png", options);
    }

    public Bitmap getSubjectIconSelected(int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        return BitmapFactory.decodeFile(AkApplication.getAppContext().getDir("subjiconpressed", 0) + "/" + i10 + ".png", options);
    }

    public boolean hasAlreadyDownloadBitmap(String str, boolean z10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AkApplication.getAppContext().getDir(z10 ? "chapeaux" : "tenues", 0));
            sb2.append("/akinator_defi_chapeau_");
            sb2.append(str);
            sb2.append(".png");
            return BitmapFactory.decodeFile(sb2.toString(), options) != null;
        } catch (OutOfMemoryError unused) {
            return false;
        }
    }

    public boolean initDefault(int i10) throws IOException {
        updateScreenWidth(i10);
        Context appContext = AkApplication.getAppContext();
        try {
            String[] strArr = f12010d;
            for (int i11 = 0; i11 < 14; i11++) {
                String str = strArr[i11];
                String str2 = str + "_orient.png";
                BufferedInputStream bufferedInputStream = new BufferedInputStream(appContext.getAssets().open("drawable/" + d() + "tenues/" + str2), 32768);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(AkApplication.getAppContext().getDir("tenues", 0), str2));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i12 = bufferedInputStream.read(bArr);
                    if (i12 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i12);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                String str3 = str + "_chapeau_turban.png";
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(appContext.getAssets().open("drawable/" + d() + "chapeaux/" + str3), 32768);
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(AkApplication.getAppContext().getDir("chapeaux", 0), str3));
                while (true) {
                    int i13 = bufferedInputStream2.read(bArr);
                    if (i13 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i13);
                }
                fileOutputStream2.flush();
                fileOutputStream2.close();
                bufferedInputStream2.close();
                String str4 = str + ".png";
                BufferedInputStream bufferedInputStream3 = new BufferedInputStream(appContext.getAssets().open("drawable/" + d() + str4), 32768);
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(AkApplication.getAppContext().getDir("apoils", 0), str4));
                while (true) {
                    int i14 = bufferedInputStream3.read(bArr);
                    if (i14 == -1) {
                        break;
                    }
                    fileOutputStream3.write(bArr, 0, i14);
                }
                fileOutputStream3.flush();
                fileOutputStream3.close();
                bufferedInputStream3.close();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isHatLoaded(String str) {
        return c("chapeaux", "akinator_vrai_decouragement_chapeau_" + str + ".png");
    }

    public synchronized int loadBackgroundSet(String str, s sVar) {
        for (int i10 = 1; i10 <= 6; i10++) {
            try {
                String str2 = "ak_decor_" + str + "_plan1" + i10 + ".png";
                int iB = b(AkApplication.getAppContext().getDir("backgrounds", 0), d() + "backgrounds/" + str2, str2);
                if (iB != 0) {
                    return iB;
                }
                if (sVar != null) {
                    sVar.onLoadingProgress(i10, 9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String str3 = "ak_decor_" + str + "_plan2.png";
        int iB2 = b(AkApplication.getAppContext().getDir("backgrounds", 0), d() + "backgrounds/" + str3, str3);
        if (iB2 != 0) {
            return iB2;
        }
        if (sVar != null) {
            sVar.onLoadingProgress(7, 9);
        }
        String str4 = "ak_decor_" + str + "_plan3.png";
        int iB3 = b(AkApplication.getAppContext().getDir("backgrounds", 0), d() + "backgrounds/" + str4, str4);
        if (iB3 != 0) {
            return iB3;
        }
        if (sVar != null) {
            sVar.onLoadingProgress(8, 9);
        }
        String str5 = "ak_decor_" + str + "_star.png";
        int iB4 = b(AkApplication.getAppContext().getDir("backgrounds", 0), d() + "backgrounds/" + str5, str5);
        if (iB4 != 0) {
            return iB4;
        }
        if (sVar != null) {
            sVar.onLoadingProgress(9, 9);
        }
        return 0;
    }

    public synchronized int loadClothes(String str, s sVar) {
        String[] strArr = f12010d;
        int i10 = 0;
        for (int i11 = 0; i11 < 14; i11++) {
            String str2 = strArr[i11] + "_" + str + ".png";
            int iB = b(AkApplication.getAppContext().getDir("tenues", 0), d() + "tenues/" + str2, str2);
            if (iB != 0) {
                return iB;
            }
            if (sVar != null) {
                i10++;
                sVar.onLoadingProgress(i10, 14);
            }
        }
        return 0;
    }

    public synchronized int loadHat(String str, s sVar) {
        String[] strArr = f12010d;
        int i10 = 0;
        for (int i11 = 0; i11 < 14; i11++) {
            String str2 = strArr[i11] + "_chapeau_" + str + ".png";
            int iB = b(AkApplication.getAppContext().getDir("chapeaux", 0), d() + "chapeaux/" + str2, str2);
            if (iB != 0) {
                return iB;
            }
            if (sVar != null) {
                i10++;
                sVar.onLoadingProgress(i10, 14);
            }
        }
        return 0;
    }

    public int loadSubjectsBackgrounds(Collection<lb.c> collection, boolean z10, s sVar) {
        int size = collection.size() * 2;
        int iA = 0;
        int i10 = 0;
        for (lb.c cVar : collection) {
            if (sVar != null) {
                sVar.onLoadingProgress(i10, size);
            }
            File dir = AkApplication.getAppContext().getDir("subjbg", 0);
            File dir2 = AkApplication.getAppContext().getDir("subjbgend", 0);
            String str = cVar.getSubjectId() + ".png";
            synchronized ("LOCKBG") {
                if (z10) {
                    iA = a(cVar.getSubjectPictureUrl(), dir, str);
                } else {
                    try {
                        if (!c("subjbg", str)) {
                            iA = a(cVar.getSubjectPictureUrl(), dir, str);
                        }
                    } finally {
                    }
                }
            }
            int i11 = i10 + 1;
            if (sVar != null) {
                sVar.onLoadingProgress(i11, size);
            }
            synchronized ("LOCKBG") {
                if (z10) {
                    iA = a(cVar.getSubjectPictureEndgameUrl(), dir2, str);
                } else {
                    try {
                        if (!c("subjbgend", str)) {
                            iA = a(cVar.getSubjectPictureEndgameUrl(), dir2, str);
                        }
                    } finally {
                    }
                }
            }
            i10 += 2;
            if (sVar != null) {
                sVar.onLoadingProgress(i10, size);
            }
        }
        return iA;
    }

    public int loadSubjectsButtons(Collection<lb.c> collection, boolean z10, s sVar) {
        int size = collection.size() * 2;
        int iA = 0;
        int i10 = 0;
        for (lb.c cVar : collection) {
            if (sVar != null) {
                sVar.onLoadingProgress(i10, size);
            }
            File dir = AkApplication.getAppContext().getDir("subjicon", 0);
            File dir2 = AkApplication.getAppContext().getDir("subjiconpressed", 0);
            String str = cVar.getSubjectId() + ".png";
            synchronized ("LOCKICONS") {
                if (z10) {
                    iA = a(cVar.getSubjectIconUrl(), dir, str);
                } else {
                    try {
                        if (!c("subjicon", str)) {
                            iA = a(cVar.getSubjectIconUrl(), dir, str);
                        }
                    } finally {
                    }
                }
            }
            int i11 = i10 + 1;
            if (sVar != null) {
                sVar.onLoadingProgress(i11, size);
            }
            synchronized ("LOCKICONS") {
                if (z10) {
                    iA = a(cVar.getSubjectIconSelectedUrl(), dir2, str);
                } else {
                    try {
                        if (!c("subjiconpressed", str)) {
                            iA = a(cVar.getSubjectIconSelectedUrl(), dir2, str);
                        }
                    } finally {
                    }
                }
            }
            i10 += 2;
            if (sVar != null) {
                sVar.onLoadingProgress(i10, size);
            }
        }
        return iA;
    }

    public void updateMaxMemory(int i10) {
        this.f12012b = i10;
    }

    public void updateScreenWidth(int i10) {
        this.f12011a = i10;
    }

    public boolean isTenueLoaded(String str) {
        return c(PtLatqAYjEFT.zja, "akinator_vrai_decouragement_" + str + ".png");
    }

    public synchronized int loadClothes(String str) {
        return loadClothes(str, null);
    }

    public synchronized int loadHat(String str) {
        return loadHat(str, null);
    }

    public synchronized int loadBackgroundSet(String str) {
        return loadBackgroundSet(str, null);
    }
}
