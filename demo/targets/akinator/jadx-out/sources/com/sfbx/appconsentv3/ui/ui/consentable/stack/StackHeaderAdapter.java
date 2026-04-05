package com.sfbx.appconsentv3.ui.ui.consentable.stack;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemStackHeaderBinding;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackHeaderAdapter extends RecyclerView.a {
    private final o appTheme$delegate;
    private final StackHeaderListener listener;
    private Stack mStack;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface StackHeaderListener {
        void onSwitchChanged(ConsentStatus consentStatus);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class StackHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemStackHeaderBinding binding;
        final /* synthetic */ StackHeaderAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StackHeaderViewHolder(StackHeaderAdapter stackHeaderAdapter, AppconsentV3ItemStackHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = stackHeaderAdapter;
            this.binding = binding;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[LOOP:2: B:23:0x0090->B:25:0x0096, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind() {
            /*
                Method dump skipped, instructions count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.consentable.stack.StackHeaderAdapter.StackHeaderViewHolder.bind():void");
        }
    }

    public StackHeaderAdapter(StackHeaderListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.appTheme$delegate = q.lazy(StackHeaderAdapter$appTheme$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getAppTheme() {
        return (AppConsentTheme) this.appTheme$delegate.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i10) {
        return R.layout.appconsent_v3_item_stack_header;
    }

    public final void setStack(Stack stack) {
        e0.checkNotNullParameter(stack, "stack");
        this.mStack = stack;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(StackHeaderViewHolder holder, int i10) {
        e0.checkNotNullParameter(holder, "holder");
        holder.bind();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public StackHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        e0.checkNotNullParameter(parent, "parent");
        AppconsentV3ItemStackHeaderBinding appconsentV3ItemStackHeaderBindingInflate = AppconsentV3ItemStackHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        e0.checkNotNullExpressionValue(appconsentV3ItemStackHeaderBindingInflate, "inflate(inflater, parent, false)");
        return new StackHeaderViewHolder(this, appconsentV3ItemStackHeaderBindingInflate);
    }
}
