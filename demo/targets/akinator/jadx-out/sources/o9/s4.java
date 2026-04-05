package o9;

import android.content.Intent;
import android.view.View;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.PostInscriptionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PostInscriptionActivity f78529c;

    public /* synthetic */ s4(PostInscriptionActivity postInscriptionActivity, int i10) {
        this.f78528b = i10;
        this.f78529c = postInscriptionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78528b;
        PostInscriptionActivity postInscriptionActivity = this.f78529c;
        switch (i10) {
            case 0:
                int i11 = PostInscriptionActivity.F;
                postInscriptionActivity.finish();
                break;
            default:
                int i12 = PostInscriptionActivity.F;
                postInscriptionActivity.getClass();
                postInscriptionActivity.startActivity(new Intent(postInscriptionActivity, (Class<?>) ConnectActivity.class));
                postInscriptionActivity.finish();
                break;
        }
    }
}
