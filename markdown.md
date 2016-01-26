# 区块元素

# 这是一个标题
## 小标题
### 小小标题

## 区块引用
> This is a blockquote with two paragraphs. Lorem ipsum dolor sit amet,
  consectetuer adipiscing elit. Aliquam hendrerit mi posuere lectus.
  Vestibulum enim wisi, viverra nec, fringilla in, laoreet vitae, risus.
  Donec sit amet nisl. Aliquam semper ipsum sit amet velit. Suspendisse
  id sem consectetuer libero luctus adipiscing.




## 区块引用层级
> 区块引用
>> 二级区块
>>> 三级区块


## 列表
### 无序列表
* list1
* list2
* list3

等同于：

+   Red
+   Green
+   Blue

也等同于：

-   Red
-   Green
-   Blue

### 有序列表
1. 列表1
2. 列表2
3. 列表3

###列表中放入引用`>`
1. list1
  >引用

2. list2




## 代码区块
和程序相关的写作或是标签语言原始码通常会有已经排版好的代码区块，通常这些区块我们并不希望它以一般段落文件的方式去排版，而是照原来的样子显示，Markdown 会用 `<pre>` 和 `<code>` 标签来把代码区块包起来。注意，markdown的段落之间要使用两个换行符来分割。不然第二段文字会直接接在第一段文字后面。

要在 Markdown 中建立代码区块很简单，只要简单地缩进 4 个空格或是 1 个制表符就可以，例如，下面的输入：

这是一个普通段落：

    这是一个代码区块。

一个代码区块会一直持续到没有缩进的那一行（或是文件结尾）。




## 分隔线
***
分割完成




## 区段元素
Markdown 支持两种形式的链接语法： 行内式和参考式两种形式。

不管是哪一种，链接文字都是用 [方括号] 来标记。

要建立一个行内式的链接，只要在方块括号后面紧接着圆括号并插入网址链接即可，如果你还想要加上链接的 title 文字，只要在网址后面，用双引号把 title 文字包起来即可，例如：

This is [an example to baidu](http://www.baidu.com/ "baidu") inline link.

[This link](http://www.baidu.com/) has no title attribute.

如果你是要链接到同样主机的资源，你可以使用相对路径：

See my [About](/about/) page for details.

参考式的链接是在链接文字的括号后面再接上另一个方括号，而在第二个方括号里面要填入用以辨识链接的标记：

This is [an example][id] reference-style link.

你也可以选择性地在两个方括号中间加上一个空格：

This is [an example] [id] reference-style link.

接着，在文件的任意处，你可以把这个标记的链接内容定义出来：

[id]: http://www.baidu.com/  "Optional Title Here"

下面是一个参考式链接的范例：

I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"

如果改成用链接名称的方式写：

I get 10 times more traffic from [Google][] than from
[Yahoo][] or [MSN][].

  [google]: http://google.com/        "Google"
  [yahoo]:  http://search.yahoo.com/  "Yahoo Search"
  [msn]:    http://search.msn.com/    "MSN Search"





## 强调
Markdown 使用星号（`*`）和底线（`_`）作为标记强调字词的符号，被`*`或 `_` 包围的字词会被转成用`<i>` 标签包围，用两个`*` 或 _ 包起来的话，则会被转成 `<strong>`，例如：

<i>直接用标签</i>

<strong>直接用标签</strong>

*single asterisks*

_single underscores_

**double asterisks**

__double underscores__





## 代码
行内代码可以这样`code`。

如果要在代码区段内插入反引号，你可以用多个反引号来开启和结束代码区段：

``这段代码我要插入一个` ``

只显示一个反引号 `` ` ``,两边要加空格。








## 图片
Markdown 使用一种和链接很相似的语法来标记图片，同样也允许两种样式： 行内式和参考式。

行内式的图片语法看起来像是：

{<1>}![Alt text](http://7sbnfg.com1.z0.glb.clouddn.com/image%2F3%2F62%2Feeba92dfa65f7e5db671cd8082566.PNG)

{<2>}![Alt text](http://7sbnfg.com1.z0.glb.clouddn.com/image%2Fd%2F76%2F5b9ba06ba770245ce077b60ff3512.PNG)

目前无法指定高度和宽度。





## GFM
GitHub用"GitHub Flavored Markdown"，简称GFM。它广泛应用在site--in issues, comments, 以及pull requests.
它和标准的Markdown有一些区别，并添加了一些额外的功能。

### 与标准Markdown的区别
下划线
标准Markdown将含有下划线的单词转成斜体字，而GFM忽略单词中的下划线。

## 删除线
GFM增加了删除线

~~这段文字要删除了~~



## 代码块
如果有一整块代码需要包围， 可以使用`` ``` ``
例如：

```
x = 0
x = 2 + 2
what is x
```

### 语法高亮
#### 高亮javascript代码：

``` javascript
var s = {
  a:1,
  b:2
};

```

#### 高亮java代码

```java
public class Test{
  public static void main(String[] args) {

  }
}

```

Github使用[Linguist](https://github.com/github/linguist)来实现语言检测和语法高亮。
你可以通过阅读[the languages YAML file.](https://github.com/github/linguist/blob/master/lib/linguist/languages.yml)来获取有效的语法高亮关键字。




## 表格
你可以创建表格，通过符号`-`分开第一行和其他行，通过`|`分开各个列

First Header  | Second Header
------------- | -------------
Content Cell  | Content Cell
Content Cell  | Content Cell


在标题行包含`:`，你可以使得表格向左对齐，向右对齐，居中

| Left-Aligned  | Center Aligned  | Right Aligned |
| :------------ |:---------------:| -----:|
| col 3 is      | some wordy text | $1600 |
| col 2 is      | centered        |   $12 |
| zebra stripes | are neat        |    $1 |

A colon on the left-most side indicates a left-aligned column; a colon on the right-most side indicates a right-aligned column; a colon on both sides indicates a center-aligned column.<br>
`:`在最左边表示左对齐，`:`在最右边表示右对齐，左右两边都有`:`表示居中。
