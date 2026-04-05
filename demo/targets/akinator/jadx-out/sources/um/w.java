package um;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class w extends s {
    public w(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // um.s
    public final void a(View view, p pVar) {
        ((zm.a) view).setImage(a.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMAJJeDLG/7//NAr9/Dv6tHGO8cYxRbDFOjS7u3y/d7BNef67PjIHeTz9swj0M401co52vHi3NPp5sQNH9nXzwIhxbEf6oAAAOpSURBVHgB7M5FAcAwAMDAcUYd+9e6Zy2kcAquKUBVVVXVdv3QiIwTzIvoA8Aq+zDLPmD7YPtg+2D7YPtg+2D7YPtg+2D7YPtg+2D7YPtg+2D7sG17OLrxvCSf6N7HR/KJwvupPsD0t2uX28rjABSGN9YNhCO4lnKQ44K73f9Njc+kpQyWtHR9i+c38tbbNMl8AV4r8izxUhneqvBc1RC8VOPZzLoVjF1IaiTgGeuel3jKBa2omQ1aEVuFoBWlfC9qdxL555fWazMoRQL/CNXfAlEkIL1/tOn2+uhrkYDDZ4kuDV+LBHZ8fV+3SGCX9Wy6inzcjwTcOlXueIFvRQL7/DTplPCtSGCvbo8OouBXkcBpRS/wqUjgxKKED0UHg9AVPm00WXQ4CI8NnzaaLDochE6cdglfigQO6NNuAD+KBA65o13Xj6LDQR2TNkP4UFTBQSPaNC3vi4wxDrIGtCnCW+Pq5BNHdA1KVQRAkpKRwfWNaVPH9VlNSgIB8EGbT1xflDbPCIAapSkCoE8phQAIUWoiCAxKMwTAG6U5AqBK6QcBEKYUQQCMKE0QsMtZDQHwHrSrWUc1KDptiMpiBl3mlO4unFtGspeAJmVKSZxtyX+ku9BjRekJ55ql3atX0ULpPLSk1NF/YhwpfXsFLe6VfnLq3uCqUpQelDaZgBZtSmu1W+AONMgo/mKa0hIaZGlTUHvUnOjep78V37D2oM6KK47IvFPvHWdC+UExTSmpd4uZG9XxCkahKKQ+HhOjznPjC21iyg92NEJQkjNpE8JFkhpXUYQaRtDe9a2id4M2Dzqe7FixcDHnmOernlMHt8pPZOp3M3fUsqZDJm16G1zsgXbNDi6Sa1DbiOcr7WoWLrBJaXxhNqZDGBeY0KEMJVU6TCy10Vf1O5lcmw6pGc5ilejQzEHR2qBDI4MzzFJ0WkHZiE69d5ws1KBTFRok6RRfWjhNP+3JdJSZ4I7vBE7QTXFHswst5gZ33YdwxMY9OcZcQ5MlXcztDAc8RtJ0+YE2K4Mu5v/PB45OTbrVodFDnDytqVAOC+6zgFbzHvcyU6Vtv/iVwaaTyI+Gk4HJvYw8NAs1qCC9hnaPA17srQsPFFq8UOoR3sj2eIF0H56ZDQ2eq5WBl7pVnqVXhNfKbzxZ+mMG723qTZ5ExGbwh/U5Pd5U+7Hgo824FD9Us/2Cf2RTk3v0SvlHXEshWl5uJ4M2aYha9SkSyyeiCAJrhl/Tzc3Nzc3Nzc3N7+6ZjDHKAbJeAAAAAElFTkSuQmCC"));
    }

    @Override // um.s
    public final View b(Context context, p pVar) {
        return new zm.a(context);
    }

    @Override // um.s
    public final p c(Context context, p pVar) {
        if (pVar == null || !"repeatfill".equals(pVar.getStyle())) {
            return a.f88525d;
        }
        p pVar2 = new p();
        pVar2.setOutlined(Boolean.TRUE);
        return a.f88525d.copyWith(pVar2);
    }
}
