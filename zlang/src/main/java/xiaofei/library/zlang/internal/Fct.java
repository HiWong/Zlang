/**
 *
 * Copyright 2011-2017 Xiaofei
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package xiaofei.library.zlang.internal;

/**
 * Created by Xiaofei on 2017/9/13.
 */

public enum Fct {
    LIT,
    LOD,
    ALOD,
    STO,
    ASTO,
    OPR,
    INT,
    JMP,
    JPF,
    JPF_SC, // Short circuit
    JPT_SC, // Short circuit
    FUN,
    PROC,
    FUN_RETURN,
    VOID_RETURN,
}
