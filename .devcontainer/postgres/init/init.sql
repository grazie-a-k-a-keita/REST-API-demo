-- ENUM型 'gender' を作成
CREATE TYPE gender AS ENUM ('M', 'F');

-- 'users' テーブルを作成
CREATE TABLE users (
  id SERIAL PRIMARY KEY, -- 自動インクリメント
  first_name VARCHAR(15) NOT NULL,
  last_name VARCHAR(15) NOT NULL,
  gender gender NOT NULL, -- ENUM型 'gender' を使用
  age INT NOT NULL
);

-- コメントを追加
COMMENT ON TABLE users IS 'ユーザー';
COMMENT ON COLUMN users.id IS 'ID';
COMMENT ON COLUMN users.first_name IS '性';
COMMENT ON COLUMN users.last_name IS '名';
COMMENT ON COLUMN users.gender IS '性別';
COMMENT ON COLUMN users.age IS '年齢';

INSERT INTO users (first_name, last_name, gender, age) VALUES
('太郎', '山田', 'M', 25),
('花子', '佐藤', 'F', 30),
('次郎', '鈴木', 'M', 22),
('美咲', '高橋', 'F', 28);
