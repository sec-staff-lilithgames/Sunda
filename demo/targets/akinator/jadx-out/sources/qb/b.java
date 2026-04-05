package qb;

import android.content.Context;
import android.graphics.Bitmap;
import com.moloco.sdk.BKC.JzVV;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import cv.BLca.YsiBvdpw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import lb.s0;
import org.w3c.dom.Document;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class b extends z {

    /* renamed from: o, reason: collision with root package name */
    public File f82658o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f82659p;

    /* renamed from: q, reason: collision with root package name */
    public final Bitmap f82660q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(lb.e session, String str, Bitmap bitmapPhoto, String reason, String str2) {
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(str, YsiBvdpw.AcEwzoDeLYEZWq);
        kotlin.jvm.internal.e0.checkNotNullParameter(bitmapPhoto, "bitmapPhoto");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        this.f82730i = "post_photo.php";
        this.f82659p = true;
        this.f82660q = bitmapPhoto;
        addParameterForPost("base", "0");
        lb.e mSession = getMSession();
        addParameterForPost("channel", (mSession == null || (channel = mSession.getChannel()) == null) ? "" : channel);
        lb.e mSession2 = getMSession();
        addParameterForPost("session", (mSession2 == null || (session2 = mSession2.getSession()) == null) ? "" : session2);
        lb.e mSession3 = getMSession();
        addParameterForPost(InAppPurchaseMetaData.KEY_SIGNATURE, (mSession3 == null || (signature = mSession3.getSignature()) == null) ? "" : signature);
        addParameterForPost("id_base", str);
        s0.b bVar = s0.f72971j;
        addParameterForPost(JzVV.SGz, bVar.sharedInstance().getPlayerName());
        String uid = bVar.sharedInstance().getUid();
        addParameterForPost("uid", uid != null ? uid : "");
        addParameterForPost("source", "android");
        addParameterForPost("commentaire", reason);
        if (str2 != null) {
            addParameterForPost("pseudo", str2);
        }
    }

    @Override // qb.d0
    public Object callAsync(zu.d<? super Integer> dVar) {
        File filesDir;
        try {
            if (this.f82659p) {
                String str = "android_upload-" + System.currentTimeMillis() + ".jpg";
                Context applicationContext = s0.f72971j.sharedInstance().getApplicationContext();
                FileOutputStream fileOutputStreamOpenFileOutput = applicationContext != null ? applicationContext.openFileOutput(str, 0) : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((applicationContext == null || (filesDir = applicationContext.getFilesDir()) == null) ? null : filesDir.getAbsolutePath());
                sb2.append('/');
                sb2.append(str);
                String string = sb2.toString();
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        Bitmap bitmap = this.f82660q;
                        if (bitmap != null) {
                            bv.b.boxBoolean(bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStreamOpenFileOutput));
                        }
                        gv.d.closeFinally(fileOutputStreamOpenFileOutput, null);
                    } finally {
                    }
                }
                this.f82658o = new File(string);
            }
            File file = this.f82658o;
            if (file != null) {
                d0.addPostParamFile$default(this, "fichier", file, null, 4, null);
            }
            return super.callAsync(dVar);
        } catch (FileNotFoundException unused) {
            return bv.b.boxInt(400);
        }
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(lb.e session, String objectIdBase, File filePhoto, String reason, String str) {
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(objectIdBase, "objectIdBase");
        kotlin.jvm.internal.e0.checkNotNullParameter(filePhoto, "filePhoto");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        this.f82730i = "post_photo.php";
        this.f82659p = false;
        this.f82660q = null;
        this.f82658o = filePhoto;
        addParameterForPost("base", "0");
        lb.e mSession = getMSession();
        addParameterForPost("channel", (mSession == null || (channel = mSession.getChannel()) == null) ? "" : channel);
        lb.e mSession2 = getMSession();
        addParameterForPost("session", (mSession2 == null || (session2 = mSession2.getSession()) == null) ? "" : session2);
        lb.e mSession3 = getMSession();
        addParameterForPost(InAppPurchaseMetaData.KEY_SIGNATURE, (mSession3 == null || (signature = mSession3.getSignature()) == null) ? "" : signature);
        addParameterForPost("id_base", objectIdBase);
        s0.b bVar = s0.f72971j;
        addParameterForPost("player", bVar.sharedInstance().getPlayerName());
        String uid = bVar.sharedInstance().getUid();
        addParameterForPost("uid", uid != null ? uid : "");
        addParameterForPost("source", "android");
        addParameterForPost("commentaire", reason);
        if (str != null) {
            addParameterForPost("pseudo", str);
        }
    }
}
