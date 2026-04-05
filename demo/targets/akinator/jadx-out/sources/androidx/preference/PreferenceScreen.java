package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.digidust.elokence.akinator.freemium.R;
import n3.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean X;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, q.getAttr(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.X = true;
    }

    @Override // androidx.preference.Preference
    public final void f() {
        if (getIntent() == null && getFragment() == null && getPreferenceCount() != 0) {
            getPreferenceManager().getOnNavigateToScreenListener();
        }
    }

    public void setShouldUseGeneratedIds(boolean z10) {
        if (isAttached()) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.X = z10;
    }

    public boolean shouldUseGeneratedIds() {
        return this.X;
    }
}
