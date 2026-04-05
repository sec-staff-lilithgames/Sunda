package com.digidust.elokence.akinator.activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h2;
import androidx.lifecycle.c1;
import ca.m;
import ca.o;
import ca.t;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivitySoundlikeBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.k;
import j1.o2;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.b1;
import lb.c;
import lb.e;
import o9.a8;
import o9.b8;
import o9.d8;
import o9.e8;
import o9.g8;
import o9.j8;
import o9.l8;
import o9.n7;
import o9.p8;
import o9.r7;
import o9.s8;
import o9.t8;
import o9.u7;
import o9.x7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class SoundlikeActivity extends AkActivity {
    public static final /* synthetic */ int L = 0;
    public ActivitySoundlikeBinding C;
    public ArrayList D = new ArrayList();
    public String E = "";
    public String F = "";
    public e.g G;
    public e.b H;
    public int I;
    public Dialog J;
    public FirebaseAnalytics K;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public static final void access$goToLost(SoundlikeActivity soundlikeActivity) {
        soundlikeActivity.getClass();
        o.sharedInstance().addOneLostGame();
        o.sharedInstance().setAkinatorStatus(1);
        Intent intent = new Intent(soundlikeActivity, (Class<?>) GameOverSliderActivity.class);
        intent.putExtra("keyComeFromSeveral", true);
        o.sharedInstance().setGameOverActivityState(11);
        soundlikeActivity.startActivity(intent);
        soundlikeActivity.finish();
    }

    public final int downloadFile(String str, File file, String fileName) {
        e0.checkNotNullParameter(fileName, "fileName");
        try {
            URL url = new URL(str);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(5000);
            uRLConnectionOpenConnection.connect();
            uRLConnectionOpenConnection.getContentLength();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), Segment.SIZE);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, fileName));
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
        } catch (FileNotFoundException unused) {
            return 404;
        } catch (MalformedURLException unused2) {
            return 2;
        } catch (IOException unused3) {
            return 2;
        }
    }

    public final void handleDescriptionFragment(d8 currentFragment) {
        e0.checkNotNullParameter(currentFragment, "currentFragment");
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        String descriptionFromEditor = currentFragment.getDescriptionFromEditor();
        Bundle bundle = new Bundle();
        bundle.putSerializable("description", this.F);
        t8 t8Var = new t8();
        t8Var.setArguments(bundle);
        e0.checkNotNull(descriptionFromEditor);
        int length = descriptionFromEditor.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = e0.compare((int) descriptionFromEditor.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (descriptionFromEditor.subSequence(i10, length + 1).toString().length() == 0 && m.sharedInstance().isDescriptionEnabledForCurrentInstance()) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("LES_CHAMPS_NE_PEUVENT_ETRE_VIDES"), 0).show();
            return;
        }
        if (m.sharedInstance().isDescriptionEnabledForCurrentInstance() && descriptionFromEditor.length() > 255) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("LA_DECRIPTION_NE_DOIT_PAS_DEPASSER_255_CHARACTERES"), 0).show();
            return;
        }
        this.F = descriptionFromEditor;
        h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
        h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, t8Var);
        h2VarBeginTransaction.commit();
    }

    public final void handleNameFragment(g8 currentFragment) {
        e0.checkNotNullParameter(currentFragment, "currentFragment");
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        d8 d8Var = new d8();
        String nameFromEditor = currentFragment.getNameFromEditor();
        Bundle bundle = new Bundle();
        bundle.putSerializable("description", this.F);
        d8Var.setArguments(bundle);
        e0.checkNotNull(nameFromEditor);
        int length = nameFromEditor.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = e0.compare((int) nameFromEditor.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (nameFromEditor.subSequence(i10, length + 1).toString().length() == 0) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("LES_CHAMPS_NE_PEUVENT_ETRE_VIDES"), 0).show();
            return;
        }
        if (nameFromEditor.length() > 100) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("LA_LONGUEUR_DU_NOM_DOIT_ETRE_COMPRISE_ENTRE_2_ET_100_CARACTERES"), 0).show();
            return;
        }
        this.E = nameFromEditor;
        h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
        h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, d8Var);
        h2VarBeginTransaction.commit();
    }

    public final void handleProposalAfterSearchFragment(j8 currentFragment) {
        e0.checkNotNullParameter(currentFragment, "currentFragment");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        currentFragment.getClass();
        arrayList2.clear();
        Iterator<Integer> it = currentFragment.f78274j.getSelectedItemsIndex().iterator();
        while (it.hasNext()) {
            arrayList2.add((e.b) currentFragment.f78274j.getItem(it.next().intValue()));
        }
        if (!arrayList2.isEmpty()) {
            this.I = currentFragment.f78274j.getSelectedItemsIndex().iterator().next().intValue();
        }
        Iterator it2 = arrayList2.iterator();
        e0.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            e0.checkNotNullExpressionValue(next, "next(...)");
            arrayList.add(((e.b) next).getIdBase());
        }
        if (arrayList2.size() > 1) {
            AkApplication.f21721h.execute(new n7(1, arrayList));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.H = (e.b) arrayList2.get(0);
        new e.c();
        this.J = k.show(this);
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new r7(this, null), 3, null);
    }

    public final void handleRetryFragment() {
        Intent intent = new Intent(this, (Class<?>) GameOverSliderActivity.class);
        o.sharedInstance().setGameOverActivityState(11);
        startActivity(intent);
        finish();
    }

    public final void handleThanksFragment() {
        if (m.sharedInstance().isAddObjectEnabledForCurrentInstance()) {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new a8(this, null), 3, null);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) GameOverSliderActivity.class);
        o.sharedInstance().setGameOverActivityState(11);
        startActivity(intent);
        finish();
    }

    public final void manageDefaultDisplay() {
        s8 s8Var = new s8();
        if (this.D == null) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            goToHome(false);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("several", this.D);
        s8Var.setArguments(bundle);
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        h2VarBeginTransaction.add(R.id.layoutFragmentContainer, s8Var);
        h2VarBeginTransaction.commit();
    }

    public final void manageNextFragment() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.layoutFragmentContainer);
        if (fragmentFindFragmentById == null) {
            manageDefaultDisplay();
            return;
        }
        if (fragmentFindFragmentById instanceof p8) {
            h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
            e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
            String textFromEditor = ((p8) fragmentFindFragmentById).getTextFromEditor();
            j8 j8Var = new j8();
            g8 g8Var = new g8();
            l8 l8Var = new l8();
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new u7(this, textFromEditor, new ArrayList(), j8Var, h2VarBeginTransaction, g8Var, l8Var, null), 3, null);
            return;
        }
        if (!(fragmentFindFragmentById instanceof s8)) {
            if (fragmentFindFragmentById instanceof g8) {
                handleNameFragment((g8) fragmentFindFragmentById);
                return;
            }
            if (fragmentFindFragmentById instanceof d8) {
                handleDescriptionFragment((d8) fragmentFindFragmentById);
                return;
            }
            if (fragmentFindFragmentById instanceof l8) {
                handleRetryFragment();
                return;
            } else if (fragmentFindFragmentById instanceof t8) {
                handleThanksFragment();
                return;
            } else {
                if (fragmentFindFragmentById instanceof j8) {
                    handleProposalAfterSearchFragment((j8) fragmentFindFragmentById);
                    return;
                }
                return;
            }
        }
        s8 s8Var = (s8) fragmentFindFragmentById;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.clear();
        Iterator<Integer> it = s8Var.f78542i.getSelectedItemsIndex().iterator();
        while (it.hasNext()) {
            arrayList2.add((e.b) s8Var.f78542i.getItem(it.next().intValue()));
        }
        Iterator it2 = arrayList2.iterator();
        e0.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            e0.checkNotNullExpressionValue(next, "next(...)");
            arrayList.add(((e.b) next).getIdBase());
        }
        if (arrayList2.size() > 1) {
            AkApplication.f21721h.execute(new n7(2, arrayList));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.H = (e.b) arrayList2.get(0);
        this.G = null;
        e.c cVar = new e.c();
        this.J = k.show(this);
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new x7(this, cVar, null), 3, null);
    }

    public final void managePreviousFragment() {
        p8 p8Var;
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        e8 e8Var = (e8) getSupportFragmentManager().findFragmentById(R.id.layoutFragmentContainer);
        if (e8Var == null) {
            manageDefaultDisplay();
            return;
        }
        if ((e8Var instanceof s8) || (e8Var instanceof g8) || (e8Var instanceof l8)) {
            p8Var = new p8();
        } else {
            if (e8Var instanceof d8) {
                this.F = ((d8) e8Var).getDescriptionFromEditor();
                g8 g8Var = new g8();
                Bundle bundle = new Bundle();
                bundle.putSerializable("name", this.E);
                g8Var.setArguments(bundle);
                h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_left, R.animator.exit_to_right);
                h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, g8Var);
                h2VarBeginTransaction.commit();
            } else if (e8Var instanceof j8) {
                if (m.sharedInstance().isAddObjectEnabledForCurrentInstance()) {
                    g8 g8Var2 = new g8();
                    h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
                    h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, g8Var2);
                    h2VarBeginTransaction.commit();
                } else {
                    l8 l8Var = new l8();
                    h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
                    h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, l8Var);
                    h2VarBeginTransaction.commit();
                }
            } else if (e8Var instanceof t8) {
                d8 d8Var = new d8();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("description", this.F);
                d8Var.setArguments(bundle2);
                h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_left, R.animator.exit_to_right);
                h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, d8Var);
                h2VarBeginTransaction.commit();
            }
            p8Var = null;
        }
        if (p8Var != null) {
            h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_left, R.animator.exit_to_right);
            h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, p8Var);
            h2VarBeginTransaction.commit();
        }
    }

    public final void manageReturnFragment() {
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.layoutFragmentContainer);
        p8 p8Var = new p8();
        if (fragmentFindFragmentById instanceof j8) {
            h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_left, R.animator.exit_to_right);
            h2VarBeginTransaction.replace(R.id.layoutFragmentContainer, p8Var);
            h2VarBeginTransaction.commit();
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.layoutFragmentContainer);
        if (fragmentFindFragmentById instanceof d8) {
            if (m.sharedInstance().isAddObjectEnabledForCurrentInstance()) {
                managePreviousFragment();
            }
        } else if (fragmentFindFragmentById instanceof g8) {
            if (m.sharedInstance().isAddObjectEnabledForCurrentInstance()) {
                managePreviousFragment();
            }
        } else if ((fragmentFindFragmentById instanceof t8) && m.sharedInstance().isAddObjectEnabledForCurrentInstance()) {
            managePreviousFragment();
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivitySoundlikeBinding activitySoundlikeBindingInflate = ActivitySoundlikeBinding.inflate(getLayoutInflater());
        this.C = activitySoundlikeBindingInflate;
        ActivitySoundlikeBinding activitySoundlikeBinding = null;
        if (activitySoundlikeBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activitySoundlikeBindingInflate = null;
        }
        setContentView(activitySoundlikeBindingInflate.getRoot());
        ActivitySoundlikeBinding activitySoundlikeBinding2 = this.C;
        if (activitySoundlikeBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activitySoundlikeBinding2 = null;
        }
        activitySoundlikeBinding2.mainLayout.setOnApplyWindowInsetsListener(new b8());
        this.K = FirebaseAnalytics.getInstance(this);
        try {
            ActivitySoundlikeBinding activitySoundlikeBinding3 = this.C;
            if (activitySoundlikeBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activitySoundlikeBinding3 = null;
            }
            ImageView imageView = activitySoundlikeBinding3.backgroundImage;
            t tVarSharedInstance = t.sharedInstance();
            c currentInstance = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance);
            Bitmap subjectBackground = tVarSharedInstance.getSubjectBackground(currentInstance.getSubjectId());
            e0.checkNotNullExpressionValue(subjectBackground, "getSubjectBackground(...)");
            Resources resources = getResources();
            e0.checkNotNullExpressionValue(resources, "getResources(...)");
            imageView.setImageDrawable(new BitmapDrawable(resources, subjectBackground));
            ActivitySoundlikeBinding activitySoundlikeBinding4 = this.C;
            if (activitySoundlikeBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activitySoundlikeBinding4 = null;
            }
            ImageView imageView2 = activitySoundlikeBinding4.layoutIconTop.imageSubjectIconTop;
            t tVarSharedInstance2 = t.sharedInstance();
            c currentInstance2 = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance2);
            Bitmap subjectIcon = tVarSharedInstance2.getSubjectIcon(currentInstance2.getSubjectId());
            e0.checkNotNullExpressionValue(subjectIcon, "getSubjectIcon(...)");
            Resources resources2 = getResources();
            e0.checkNotNullExpressionValue(resources2, "getResources(...)");
            imageView2.setImageDrawable(new BitmapDrawable(resources2, subjectIcon));
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
        }
        ActivitySoundlikeBinding activitySoundlikeBinding5 = this.C;
        if (activitySoundlikeBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activitySoundlikeBinding5 = null;
        }
        activitySoundlikeBinding5.titleText.setTypeface(this.f21690m);
        ActivitySoundlikeBinding activitySoundlikeBinding6 = this.C;
        if (activitySoundlikeBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activitySoundlikeBinding6 = null;
        }
        o2.A(b1.f72741d, "TITRE_A_QUOI_PENSES_TU", activitySoundlikeBinding6.titleText);
        ActivitySoundlikeBinding activitySoundlikeBinding7 = this.C;
        if (activitySoundlikeBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySoundlikeBinding = activitySoundlikeBinding7;
        }
        TextView titleText = activitySoundlikeBinding.titleText;
        e0.checkNotNullExpressionValue(titleText, "titleText");
        markTextviewForUpdate(titleText);
        updateTextViewsSize();
        this.D = (ArrayList) getIntent().getSerializableExtra("several");
        manageDefaultDisplay();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
