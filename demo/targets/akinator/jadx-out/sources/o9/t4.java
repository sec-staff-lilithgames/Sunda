package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.PostProposeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PostProposeActivity f78564c;

    public /* synthetic */ t4(PostProposeActivity postProposeActivity, int i10) {
        this.f78563b = i10;
        this.f78564c = postProposeActivity;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f78563b;
        PostProposeActivity postProposeActivity = this.f78564c;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                int i11 = PostProposeActivity.Z;
                postProposeActivity.getClass();
                if (num.intValue() != 0 && num.intValue() == 400) {
                    Toast.makeText(postProposeActivity, "Erreur technique, merci de réessayer plus tard.", 0).show();
                    break;
                }
                break;
            case 1:
                int i12 = PostProposeActivity.Z;
                postProposeActivity.getClass();
                if (num.intValue() != 0 && num.intValue() == 400) {
                    Toast.makeText(postProposeActivity, "Erreur technique, merci de réessayer plus tard.", 0).show();
                    break;
                }
                break;
            default:
                int i13 = PostProposeActivity.Z;
                postProposeActivity.getClass();
                if (num.intValue() != 0 && num.intValue() == 400) {
                    Toast.makeText(postProposeActivity, "Erreur technique, merci de réessayer plus tard.", 0).show();
                    break;
                }
                break;
        }
    }
}
