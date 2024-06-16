CREATE TABLE users (
  id SERIAL PRIMARY KEY, -- 自動インクリメント
  first_name VARCHAR(15) NOT NULL,
  last_name VARCHAR(15) NOT NULL,
  age INT NOT NULL
);

COMMENT ON TABLE users IS 'ユーザー';
COMMENT ON COLUMN users.id IS 'ID';
COMMENT ON COLUMN users.first_name IS '性';
COMMENT ON COLUMN users.last_name IS '名';
COMMENT ON COLUMN users.age IS '年齢';

INSERT INTO users (first_name, last_name, age) VALUES
('太郎', '山田', 25),
('花子', '佐藤', 30),
('次郎', '鈴木', 22),
('美咲', '高橋', 28);
