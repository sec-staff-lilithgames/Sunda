package um;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class l extends s {
    public l(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // um.s
    public final void a(View view, p pVar) {
        zm.a aVar = (zm.a) view;
        if ("skip".equals(pVar.getStyle()) || "skipfill".equals(pVar.getStyle())) {
            aVar.setImage(a.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACoklEQVR4Ae3dAUScYRzH8eEQDiEMQxiGIQxhiGEIIQxhGEIIIQzDMAwhDMMQhiEMMIQhhABhCCGEEMLh9gMwi65nPau/z4cvAH784bx37z0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAALiOx+llWkqzxXYtpMU0k/4x5tNBGv/RXpq/57v2/7JrNz1NQauVNErjKxql92lQcNdGasDTdJnG1+ggPS64ay89StzAlzSeoIv0puCu87ScJsRpGt+g3TRTcNdOGqZrYtzQSXpZcNdxep5aOKAJ2kpTBXY1fHBwQK0dprkCuxo+ODig1i7TesFdF2k1tXBAE/QjPSqwq+GDgwNq7SwtFdx1mhZTCwc0QZ/TsOCu7TSVHFCHfqX5gruO0pwD6tMovU2Dgrs20sAB9Wk/zdbZ5Xna+D90kVYK7jpPrxxQv76l6YK7dtK0A+rTSVq4v7s8TxvfkT6mQbFdo/QhDRxQnw7Tk4K7DtITB9Sny7RWcNdFWnNA/fqeHhbdNeOA+nSWFu1yQK19SsOCu7bT0AF1fO5klwNqaZReV93lgPq1XHhXBw7oLE1V3eWA+rRYeFcHDuhd2V13nwNyQA5opfAuB9Thedmw/q7b4oA26u+6LQ5oq/6u2+CAztOKXTfhgH6mWbsm5YBGaTMN7JqUAzpKz+xyQO3f/7HLAbV/U88uB9T+HWi7HFDjrxXsckBNvwOzywG1/GLTLgd0nBbsugkH9DVN21XLnX5vjl0OaC/N2lXUXXzeY5cDOkpzdjmg9t9721Vb1Te4d3qORYd33thVWeF/sem0i7OW9/7ZxW7L8x67mE+jlncf28Vm69vX7WI5nV7xV03LdnEdg/Qirab1tJAGdgEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdPQbak6roi3sq5YAAAAASUVORK5CYII="));
        } else {
            aVar.setImage(a.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
        }
    }

    @Override // um.s
    public final View b(Context context, p pVar) {
        return new zm.a(context);
    }

    @Override // um.s
    public final p c(Context context, p pVar) {
        return a.resolveDefCloseStyle(context, pVar);
    }
}
