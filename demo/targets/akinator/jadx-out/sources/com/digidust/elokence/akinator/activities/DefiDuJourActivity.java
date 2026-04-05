package com.digidust.elokence.akinator.activities;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h2;
import ba.o;
import bj.v0;
import ca.m;
import ca.r;
import com.digidust.elokence.akinator.freemium.R;
import da.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jb.h;
import kotlin.jvm.internal.e0;
import lb.b1;
import mt.b0;
import nh.n1;
import o9.k0;
import o9.l0;
import o9.o0;
import o9.x;
import ot.c;
import ou.j;
import timber.log.Timber;
import u9.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DefiDuJourActivity extends AkActivity implements View.OnClickListener {
    public static final int[] P = {100, 200, 300, 400, 500};
    public ImageView C;
    public Button D;
    public RelativeLayout E;
    public ImageView F;
    public ImageView G;
    public RelativeLayout H;
    public Button I;
    public o L;
    public int M;
    public int J = 0;
    public int K = 0;
    public boolean N = false;
    public final b O = new b(this);

    public static void v(int i10) {
        b0.fromCallable(new k0(i10, 0)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new ca.b(12));
    }

    public void majIcon(boolean z10) {
        this.I.setEnabled(z10);
        this.I.setAlpha(z10 ? 1.0f : 0.5f);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.M != 0) {
            finish();
            return;
        }
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (fragmentFindFragmentById == null || !fragmentFindFragmentById.isVisible()) {
            goToHome(true);
            return;
        }
        Fragment fragmentFindFragmentById2 = getSupportFragmentManager().findFragmentById(R.id.container);
        if (fragmentFindFragmentById2 == null) {
            return;
        }
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        h2VarBeginTransaction.remove(fragmentFindFragmentById2);
        h2VarBeginTransaction.commit();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws IOException {
        if (view != this.D) {
            if (view == this.C) {
                if (this.M != 0) {
                    finish();
                    return;
                }
                Intent intent = new Intent(this, (Class<?>) PostProposeActivity.class);
                intent.putExtra("keyComeFromDefi", true);
                intent.putExtra("keyNbDefi", this.K);
                intent.putExtra("keyDefiFull", this.K == this.J);
                startActivity(intent);
                finish();
                return;
            }
            RelativeLayout relativeLayout = this.H;
            if (view == relativeLayout) {
                relativeLayout.setClickable(false);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setFillAfter(false);
                alphaAnimation.setAnimationListener(new o0(this));
                this.H.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        na.b.playBip();
        try {
            Bitmap characterScreenshotDefi = ca.o.sharedInstance().getCharacterScreenshotDefi();
            if (characterScreenshotDefi != null) {
                File file = new File(getApplicationContext().getFilesDir(), "images");
                if (!file.exists()) {
                    file.mkdir();
                }
                File file2 = new File(file, "defi.jpg");
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                Uri uriForFile = FileProvider.getUriForFile(getApplicationContext(), getApplicationContext().getResources().getString(R.string.authority), file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                characterScreenshotDefi.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("image/jpeg");
                intent2.putExtra("android.intent.extra.STREAM", uriForFile);
                displayFragmentPartageScreenShot(intent2);
            }
        } catch (IOException e10) {
            Timber.tag("DefiDuJourActivity").e(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040b  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.DefiDuJourActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.O.onPause();
        super.onPause();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.O.onResume();
        traiteAddGz();
    }

    public void setCandAddGz(boolean z10) {
        this.N = z10;
    }

    public final void t() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.F, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(1000L);
        duration.addListener(new l0(this));
        duration.start();
    }

    public void traiteAddGz() {
        if (this.N) {
            this.N = false;
            int i10 = P[this.K - 1];
            if (!m.sharedInstance().isUserConnected()) {
                r.sharedInstance().depositGenizWithoutNotif(i10);
            }
            h.sharedInstance().createOrUpdateMetricCompteur("gz_gain_video", i10);
            if (m.sharedInstance().isUserConnected()) {
                v(i10);
            }
            String strReplace = b1.sharedInstance().getTraductionFromToken("BRAVO_TU_AS_GAGNE_GENIZ").replace("[NB_GENIZ]", "" + i10);
            f fVar = new f(this);
            fVar.setTypeOk(strReplace);
            fVar.setOkListener(new n1(12));
            h.sharedInstance().incMetricCompteur("video_views");
        }
    }

    public final void u() {
        b0.fromCallable(new x(3)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new v0(this, 14));
    }
}
