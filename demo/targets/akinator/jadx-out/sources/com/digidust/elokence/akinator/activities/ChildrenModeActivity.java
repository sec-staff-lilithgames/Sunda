package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ca.m;
import com.digidust.elokence.akinator.activities.ChildrenModeActivity;
import com.digidust.elokence.akinator.activities.SendFormActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivityChildrenModeBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import lb.b1;
import lb.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ChildrenModeActivity extends AkActivity {
    public static final /* synthetic */ int G = 0;
    public ActivityChildrenModeBinding C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public View.OnClickListener F;

    public ChildrenModeActivity() {
        final int i10 = 0;
        this.D = new View.OnClickListener(this) { // from class: o9.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ChildrenModeActivity f78408c;

            {
                this.f78408c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ChildrenModeActivity childrenModeActivity = this.f78408c;
                switch (i11) {
                    case 0:
                        int i12 = ChildrenModeActivity.G;
                        na.b.playBip();
                        ca.m.sharedInstance().setChildProtectEnabled(!ca.m.sharedInstance().isChildProtectEnabled());
                        ActivityChildrenModeBinding activityChildrenModeBinding = null;
                        if (ca.m.sharedInstance().isChildProtectEnabled()) {
                            ActivityChildrenModeBinding activityChildrenModeBinding2 = childrenModeActivity.C;
                            if (activityChildrenModeBinding2 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityChildrenModeBinding = activityChildrenModeBinding2;
                            }
                            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_on_menu);
                        } else {
                            ActivityChildrenModeBinding activityChildrenModeBinding3 = childrenModeActivity.C;
                            if (activityChildrenModeBinding3 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityChildrenModeBinding = activityChildrenModeBinding3;
                            }
                            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_off_menu);
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 1:
                        int i13 = ChildrenModeActivity.G;
                        Intent intent = new Intent(childrenModeActivity, (Class<?>) SendFormActivity.class);
                        intent.putExtra("RadioButton", 1);
                        childrenModeActivity.startActivity(intent);
                        break;
                    default:
                        int i14 = ChildrenModeActivity.G;
                        childrenModeActivity.onBackPressed();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.E = new View.OnClickListener(this) { // from class: o9.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ChildrenModeActivity f78408c;

            {
                this.f78408c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                ChildrenModeActivity childrenModeActivity = this.f78408c;
                switch (i112) {
                    case 0:
                        int i12 = ChildrenModeActivity.G;
                        na.b.playBip();
                        ca.m.sharedInstance().setChildProtectEnabled(!ca.m.sharedInstance().isChildProtectEnabled());
                        ActivityChildrenModeBinding activityChildrenModeBinding = null;
                        if (ca.m.sharedInstance().isChildProtectEnabled()) {
                            ActivityChildrenModeBinding activityChildrenModeBinding2 = childrenModeActivity.C;
                            if (activityChildrenModeBinding2 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityChildrenModeBinding = activityChildrenModeBinding2;
                            }
                            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_on_menu);
                        } else {
                            ActivityChildrenModeBinding activityChildrenModeBinding3 = childrenModeActivity.C;
                            if (activityChildrenModeBinding3 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityChildrenModeBinding = activityChildrenModeBinding3;
                            }
                            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_off_menu);
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 1:
                        int i13 = ChildrenModeActivity.G;
                        Intent intent = new Intent(childrenModeActivity, (Class<?>) SendFormActivity.class);
                        intent.putExtra("RadioButton", 1);
                        childrenModeActivity.startActivity(intent);
                        break;
                    default:
                        int i14 = ChildrenModeActivity.G;
                        childrenModeActivity.onBackPressed();
                        break;
                }
            }
        };
        final int i12 = 2;
        this.F = new View.OnClickListener(this) { // from class: o9.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ChildrenModeActivity f78408c;

            {
                this.f78408c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                ChildrenModeActivity childrenModeActivity = this.f78408c;
                switch (i112) {
                    case 0:
                        int i122 = ChildrenModeActivity.G;
                        na.b.playBip();
                        ca.m.sharedInstance().setChildProtectEnabled(!ca.m.sharedInstance().isChildProtectEnabled());
                        ActivityChildrenModeBinding activityChildrenModeBinding = null;
                        if (ca.m.sharedInstance().isChildProtectEnabled()) {
                            ActivityChildrenModeBinding activityChildrenModeBinding2 = childrenModeActivity.C;
                            if (activityChildrenModeBinding2 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityChildrenModeBinding = activityChildrenModeBinding2;
                            }
                            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_on_menu);
                        } else {
                            ActivityChildrenModeBinding activityChildrenModeBinding3 = childrenModeActivity.C;
                            if (activityChildrenModeBinding3 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityChildrenModeBinding = activityChildrenModeBinding3;
                            }
                            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_off_menu);
                        }
                        lb.s0.f72971j.sharedInstance().saveSettings();
                        break;
                    case 1:
                        int i13 = ChildrenModeActivity.G;
                        Intent intent = new Intent(childrenModeActivity, (Class<?>) SendFormActivity.class);
                        intent.putExtra("RadioButton", 1);
                        childrenModeActivity.startActivity(intent);
                        break;
                    default:
                        int i14 = ChildrenModeActivity.G;
                        childrenModeActivity.onBackPressed();
                        break;
                }
            }
        };
    }

    public final View.OnClickListener getMListenerBack() {
        return this.F;
    }

    public final View.OnClickListener getMListenerModeChoisi() {
        return this.D;
    }

    public final View.OnClickListener getMListenerSignaler() {
        return this.E;
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityChildrenModeBinding activityChildrenModeBindingInflate = ActivityChildrenModeBinding.inflate(getLayoutInflater());
        this.C = activityChildrenModeBindingInflate;
        ActivityChildrenModeBinding activityChildrenModeBinding = null;
        if (activityChildrenModeBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBindingInflate = null;
        }
        setContentView(activityChildrenModeBindingInflate.getRoot());
        ActivityChildrenModeBinding activityChildrenModeBinding2 = this.C;
        if (activityChildrenModeBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding2 = null;
        }
        TextView textView = activityChildrenModeBinding2.textActivation;
        Typeface typeface = this.f21687j;
        textView.setTypeface(typeface);
        ActivityChildrenModeBinding activityChildrenModeBinding3 = this.C;
        if (activityChildrenModeBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding3 = null;
        }
        TextView textView2 = activityChildrenModeBinding3.textActivation;
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "MENU_MODE_ENFANT_ACTIVATE", textView2);
        ActivityChildrenModeBinding activityChildrenModeBinding4 = this.C;
        if (activityChildrenModeBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding4 = null;
        }
        activityChildrenModeBinding4.textExplicatifChildrenVote.setTypeface(typeface);
        ActivityChildrenModeBinding activityChildrenModeBinding5 = this.C;
        if (activityChildrenModeBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding5 = null;
        }
        o2.A(aVar, "MENU_MODE_ENFANT_DESCRIPTION", activityChildrenModeBinding5.textExplicatifChildrenVote);
        ActivityChildrenModeBinding activityChildrenModeBinding6 = this.C;
        if (activityChildrenModeBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding6 = null;
        }
        activityChildrenModeBinding6.textSignalement.setTypeface(typeface);
        ActivityChildrenModeBinding activityChildrenModeBinding7 = this.C;
        if (activityChildrenModeBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding7 = null;
        }
        o2.A(aVar, "MENU_MODE_ENFANT_SIGNALER_CONTENU", activityChildrenModeBinding7.textSignalement);
        ActivityChildrenModeBinding activityChildrenModeBinding8 = this.C;
        if (activityChildrenModeBinding8 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding8 = null;
        }
        activityChildrenModeBinding8.textSignalementExplication.setTypeface(typeface);
        ActivityChildrenModeBinding activityChildrenModeBinding9 = this.C;
        if (activityChildrenModeBinding9 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding9 = null;
        }
        o2.A(aVar, "MENU_MODE_ENFANT_SIGNALER_CONTENU_EXPLICATION", activityChildrenModeBinding9.textSignalementExplication);
        ActivityChildrenModeBinding activityChildrenModeBinding10 = this.C;
        if (activityChildrenModeBinding10 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding10 = null;
        }
        activityChildrenModeBinding10.textTitleForm.setTypeface(typeface);
        ActivityChildrenModeBinding activityChildrenModeBinding11 = this.C;
        if (activityChildrenModeBinding11 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding11 = null;
        }
        o2.A(aVar, "MENU_MODE_ENFANT", activityChildrenModeBinding11.textTitleForm);
        ActivityChildrenModeBinding activityChildrenModeBinding12 = this.C;
        if (activityChildrenModeBinding12 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding12 = null;
        }
        activityChildrenModeBinding12.signalement.setOnClickListener(this.E);
        ActivityChildrenModeBinding activityChildrenModeBinding13 = this.C;
        if (activityChildrenModeBinding13 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityChildrenModeBinding13 = null;
        }
        activityChildrenModeBinding13.childrenModeImage.setOnClickListener(this.D);
        ActivityChildrenModeBinding activityChildrenModeBinding14 = this.C;
        if (activityChildrenModeBinding14 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityChildrenModeBinding = activityChildrenModeBinding14;
        }
        activityChildrenModeBinding.relativeBackButton.setOnClickListener(this.F);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ActivityChildrenModeBinding activityChildrenModeBinding = null;
        if (m.sharedInstance().isChildProtectEnabled()) {
            ActivityChildrenModeBinding activityChildrenModeBinding2 = this.C;
            if (activityChildrenModeBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                activityChildrenModeBinding = activityChildrenModeBinding2;
            }
            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_on_menu);
        } else {
            ActivityChildrenModeBinding activityChildrenModeBinding3 = this.C;
            if (activityChildrenModeBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                activityChildrenModeBinding = activityChildrenModeBinding3;
            }
            activityChildrenModeBinding.childrenModeImage.setImageResource(R.drawable.switch_off_menu);
        }
        s0.f72971j.sharedInstance().saveSettings();
    }

    public final void setMListenerBack(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.F = onClickListener;
    }

    public final void setMListenerModeChoisi(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.D = onClickListener;
    }

    public final void setMListenerSignaler(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.E = onClickListener;
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
