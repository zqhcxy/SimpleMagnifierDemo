# SimpleMagnifierDemo

## 简单的官方工具类，核心代码：
```java
 mTextView.setOnTouchListener(new View.OnTouchListener() {
                @RequiresApi(api = 28)
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    switch (event.getActionMasked()) {
                        case MotionEvent.ACTION_DOWN:
                            magnifier.show(event.getX(), event.getY());
                        case MotionEvent.ACTION_MOVE:
                            magnifier.show(event.getX(), event.getY());
                        case MotionEvent.ACTION_UP:
                            magnifier.dismiss();
                            break;
                    }

                    return false;
                }
            });
```
