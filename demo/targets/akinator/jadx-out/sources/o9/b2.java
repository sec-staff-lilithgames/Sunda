package o9;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import kotlinx.coroutines.CoroutineScope;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class b2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78042i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f78043j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Bitmap f78044k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(int i10, Bitmap bitmap, HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78042i = homeActivity;
        this.f78043j = i10;
        this.f78044k = bitmap;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new b2(this.f78043j, this.f78044k, this.f78042i, dVar);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((b2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f78043j;
        HomeActivity homeActivity = this.f78042i;
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ActivityHomeBinding activityHomeBinding = null;
        try {
            if (homeActivity.N != null) {
                Dialog dialog = homeActivity.N;
                kotlin.jvm.internal.e0.checkNotNull(dialog);
                if (dialog.isShowing()) {
                    Dialog dialog2 = homeActivity.N;
                    kotlin.jvm.internal.e0.checkNotNull(dialog2);
                    dialog2.dismiss();
                }
            }
        } catch (Exception unused) {
            homeActivity.N = null;
        }
        b1.a aVar = lb.b1.f72741d;
        String traductionFromToken = aVar.sharedInstance().getTraductionFromToken("PENSEZ_A_UN_PERSONNAGE_REEL_OU_FICTIF");
        ActivityHomeBinding activityHomeBinding2 = homeActivity.D;
        if (activityHomeBinding2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding2 = null;
        }
        activityHomeBinding2.textDescriptionGame.setText(traductionFromToken);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(j1.o2.l(aVar.sharedInstance().getTraductionFromToken("DEFIE_MOI"), "\n"));
        spannableString.setSpan(new AbsoluteSizeSpan(20, true), 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannableString spannableString2 = new SpannableString(aVar.sharedInstance().getTraductionFromToken("JE_VAIS_LIRE_DANS_TES_PENSEES"));
        spannableString2.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString2.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString2);
        ActivityHomeBinding activityHomeBinding3 = homeActivity.D;
        if (activityHomeBinding3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding3 = null;
        }
        activityHomeBinding3.playButton.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        try {
            if (ca.t.sharedInstance().getSubjectBackground(i10) != null) {
                ActivityHomeBinding activityHomeBinding4 = homeActivity.D;
                if (activityHomeBinding4 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding4 = null;
                }
                RelativeLayout relativeLayout = activityHomeBinding4.contentFrame;
                Bitmap subjectBackground = ca.t.sharedInstance().getSubjectBackground(i10);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(subjectBackground, "getSubjectBackground(...)");
                Resources resources = homeActivity.getResources();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(resources, SUvoXnn.BUwyAuPeSd);
                relativeLayout.setBackground(new BitmapDrawable(resources, subjectBackground));
            }
            ActivityHomeBinding activityHomeBinding5 = homeActivity.D;
            if (activityHomeBinding5 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
            } else {
                activityHomeBinding = activityHomeBinding5;
            }
            activityHomeBinding.themeImageChoosen.setImageBitmap(this.f78044k);
        } catch (OutOfMemoryError unused2) {
            Toast.makeText(homeActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
        }
        return tu.x0.f87415a;
    }
}
